a = list(map(int,input().split()))
b = int(input())

a.sort(reverse=True)

for i in a:
    temp = 0
    j = 0
    while(True):
        j += 1
        temp = i * j
        if b < temp:
            temp -= i
            break
    b -= temp
if b == 0:
    print("YES")
else:
    print("NO")