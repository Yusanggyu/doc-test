import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MyFrame extends JFrame {
    private JLabel [] keyMessage;
    JLabel la = new JLabel("asd");
    public MyFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.addKeyListener(new MyKeyListener());

        la.setLocation(20,30);

        setSize(300, 150);
        setVisible(true);

        c.setFocusable(true);
        c.requestFocus();
    }

    class MyKeyListener extends KeyAdapter {
        public void keyPressed(KeyEvent e) {
            int keycode = e.getKeyCode();
            switch (keycode) {
                case KeyEvent.VK_UP:
                    la.setLocation(la.getX(),la.getY()+10);
                    System.out.println("up"); break;
                case KeyEvent.VK_DOWN:
                    la.setLocation(la.getX(),la.getY()-10);
                    System.out.println("down"); break;
                case KeyEvent.VK_LEFT:
                    la.setLocation(la.getX()+10,la.getY());
                    System.out.println("left"); break;
                case KeyEvent.VK_RIGHT:
                    la.setLocation(la.getX()-10,la.getY()+10);
                    System.out.println("down"); break;
            }
        }
    }
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
    }
}