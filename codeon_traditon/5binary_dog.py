a = int(input())

line = ''
while a>0:
  line += str(a%5)
  a = a // 5
list = list(line)
list = list[::-1]
result = ''
for i in range(len(list)):
  if list[i] == '0':
    result += ' '
  elif list[i] == '1':
    result += '멍'
  elif list[i] == '2':
    result += '왈'
  elif list[i] == '3':
    result += '킁'
  elif list[i] == '4':
    result += '컹'
print(result)