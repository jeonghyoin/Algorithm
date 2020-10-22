# 모든 접미사를 사전순으로 정렬한 다음 출력
S = input()

length = len(S)
results = [S for i in range(length)]
for i in range(0, length):
    results[i] = S[i:length]

results.sort();
for i in range(0, len(results)):
    print(results[i])