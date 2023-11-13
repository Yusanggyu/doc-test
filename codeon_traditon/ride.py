a = int(input())
ride = {0: 1000, 2200: 2359}

for _ in range(a):
  b, c = map(int, input().split())
  b = b - 50 if list(str(b))[2] == '0' else b - 10
  c = c + 50 if list(str(c))[2] == '5' else c + 10
  ride[b] = c
  
rides = sorted(ride.items(), key=lambda x:x[1])
longest = 0
for i in range(a+1):
  val = rides[i+1][0]//100 - rides[i][1]//100
  temp = rides[i+1][0] - rides[i][1]
  if temp > longest:
    longest = temp
    if val >= 0:
      longest -= val * 40
print(longest)