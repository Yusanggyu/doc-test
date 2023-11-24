k = 0
N = int
for i in range(N): # O(N)
    for j in range(N): # O(N*N)
        k = i + j

for i in range(N): # O(N*N + N)
    k+1