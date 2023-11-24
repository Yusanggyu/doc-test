#가장 최악의 경우를 고려
def sum(arr):
    j = 0
    #n개의 요소를 가진 배열 중 홀수의 요소를 가지지 않는 경우.
    for i in arr:
        # j 변수에 더하는 과전을 O(1)으로 가정하면 O(N)개 (0 - n-1)
        if i % 2 != 0:
            break
        j += i
    return j

a = list(map(int,input().split()))
print("리스트의 합 {}".format(sum(a)))