# 수 입력받기
T = int(input())

for i in range(0, T):
    A, B = map(int, input().split(','))
    print(A + B)