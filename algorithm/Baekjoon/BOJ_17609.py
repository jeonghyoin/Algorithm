# N이 회문인지, 유사회문인지, 문자열인지 판단하기
T = int(input())

# s는 1씩 증가하고, e는 1씩 감소시키면서 비교한다.
def palindrome(N):
    count = 0
    s = 0
    e = len(N) - 1
    while s < (len(N)//2):
        if count > 1:
            break;
        if N[s] != N[e]:
            count += 1
            e -= 1
        else:
            s += 1
            e -= 1
    return count


for i in range(0, T):
    N = input()
    results = [0 for i in range(2)]
    results[0] = palindrome(N) # 오른쪽을 줄이며 탐색
    results[1] = palindrome(''.join(reversed(N))) # 왼쪽을 줄이며 탐색
    print(min(results))