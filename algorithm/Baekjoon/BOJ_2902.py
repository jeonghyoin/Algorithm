# 최대 100글자의 영어 알파벳 대문자, 소문자, 그리고 하이픈 ('-', 아스키코드 45)
# 하이픈 뒤에는 반드시 대문자
S = input()

array = S.split('-')
result = ""
for i in array:
    result = result + i[0]

print(result)