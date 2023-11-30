def binary(array, target):
    mid = max(array)//2
    temparr = [0,0,0,0,0]
    for i in range(len(array)):
        array[i] -= mid
        temparr[i] = array[i]
        if temparr[i] < 0:
            temparr[i] = 0
    if sum(temparr) == target:
        return mid
    elif sum(temparr) > target:
        return binary(temparr,target)
    else:
        for j in range(len(array)):
            array[j] += mid
        return binary(array,target)

n,target = map(int,input().split())
array = list(map(int,input().split()))
result = binary(array,target)
if result == False:
    print("없음")
else:
    print(result)

# n,target = map(int,input().split())
# array = list(map(int,input().split()))
# i = 0
# while target != array[i]:
#     i += 1
# print(array[i])