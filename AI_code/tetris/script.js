const canvas = document.getElementById('tetrisCanvas');
const ctx = canvas.getContext('2d');

const ROWS = 20;
const COLS = 10;
const BLOCK_SIZE = 30;

let gameBoard = [];

let currentTetromino = null;
let currentTetrominoX = 0;
let currentTetrominoY = 0;

let lastTime = 0;
let deltaTime = 0;
let timer = 0;

function createGameBoard() {
  for (let row = 0; row < ROWS; row++) {
    gameBoard[row] = [];
    for (let col = 0; col < COLS; col++) {
      gameBoard[row][col] = 0;
    }
  }
}

function createTetromino() {
  const tetrominos = [
    [[1, 1, 1, 1]], // I shape
    [[1, 1], [1, 1]], // O shape
    [[1, 1, 0], [0, 1, 1]], // Z shape
    [[0, 1, 1], [1, 1, 0]], // S shape
    [[1, 1, 1], [0, 1, 0]], // T shape
    [[1, 1, 1], [0, 0, 1]], // L shape
    [[1, 1, 1], [1, 0, 0]], // J shape
  ];

  const randomIndex = Math.floor(Math.random() * tetrominos.length);
  const tetromino = tetrominos[randomIndex];

  currentTetromino = tetromino;
  currentTetrominoX = Math.floor(COLS / 2) - Math.floor(tetromino[0].length / 2);
  currentTetrominoY = 0;
}

function drawTetromino() {
  currentTetromino.forEach((row, rowIndex) => {
    row.forEach((col, colIndex) => {
      if (col) {
        const x = currentTetrominoX + colIndex;
        const y = currentTetrominoY + rowIndex;
        ctx.fillStyle = 'rgb(255, 0, 0)';
        ctx.fillRect(x * BLOCK_SIZE, y * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
      }
    });
  });
}

function updateGame(time) {
  deltaTime = time - lastTime;
  lastTime = time;
  timer += deltaTime;

  if (timer > 1000) {
    moveTetrominoDown();
    timer = 0;
  }

  drawGameBoard();
  drawTetromino();

  requestAnimationFrame(updateGame);
}

function drawGameBoard() {
  ctx.clearRect(0, 0, canvas.width, canvas.height);
  ctx.fillStyle = 'rgb(0, 0, 0)';
  ctx.fillRect(0, 0, canvas.width, canvas.height);

  gameBoard.forEach((row, rowIndex) => {
    row.forEach((col, colIndex) => {
      if (col) {
        ctx.fillStyle = 'rgb(0, 255, 0)';
        ctx.fillRect(colIndex * BLOCK_SIZE, rowIndex * BLOCK_SIZE, BLOCK_SIZE, BLOCK_SIZE);
      }
    });
  });
}

function moveTetrominoDown() {
  if (isValidMove(currentTetromino, currentTetrominoX, currentTetrominoY + 1)) {
    currentTetrominoY++;
  } else {
    mergeTetrominoToGameBoard();
    clearCompletedRows();
    createTetromino();
  }
}

function rotateTetromino() {
  const rotatedTetromino = transposeMatrix(currentTetromino.reverse());
  if (isValidMove(rotatedTetromino, currentTetrominoX, currentTetrominoY)) {
    currentTetromino = rotatedTetromino;
  }
}

function moveTetrominoLeft() {
  if (isValidMove(currentTetromino, currentTetrominoX - 1, currentTetrominoY)) {
    currentTetrominoX--;
  }
}

function moveTetrominoRight() {
  if (isValidMove(currentTetromino, currentTetrominoX + 1, currentTetrominoY)) {
    currentTetrominoX++;
  }
}

function isValidMove(tetromino, newX, newY) {
  for (let row = 0; row < tetromino.length; row++) {
    for (let col = 0; col < tetromino[row].length; col++) {
      if (tetromino[row][col]) {
        const x = newX + col;
        const y = newY + row;

        if (
          x < 0 ||
          x >= COLS ||
          y >= ROWS ||
          (y >= 0 && gameBoard[y][x])
        ) {
          return false;
        }
      }
    }
  }

  return true;
}

function mergeTetrominoToGameBoard() {
  currentTetromino.forEach((row, rowIndex) => {
    row.forEach((col, colIndex) => {
      if (col) {
        const x = currentTetrominoX + colIndex;
        const y = currentTetrominoY + rowIndex;
        gameBoard[y][x] = 1;
      }
    });
  });
}

function clearCompletedRows() {
  for (let row = ROWS - 1; row >= 0; row--) {
    if (gameBoard[row].every(col => col)) {
      gameBoard.splice(row, 1);
      gameBoard.unshift(new Array(COLS).fill(0));
    }
  }
}

function transposeMatrix(matrix) {
  return matrix[0].map((_, colIndex) => matrix.map(row => row[colIndex]));
}

function initGame() {
  createGameBoard();
  createTetromino();

  document.addEventListener('keydown', (event) => {
    switch (event.keyCode) {
      case 37: // Left arrow key
        moveTetrominoLeft();
        break;
      case 39: // Right arrow key
        moveTetrominoRight();
        break;
      case 38: // Up arrow key
        rotateTetromino();
        break;
      case 40: // Down arrow key
        moveTetrominoDown();
        break;
    }
  });

  requestAnimationFrame(updateGame);
}

canvas.width = COLS * BLOCK_SIZE; // Adjusting the canvas width
canvas.height = (ROWS + 5) * BLOCK_SIZE; // Adjusting the canvas height

initGame();