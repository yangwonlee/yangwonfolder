import re

a = '나는 컴퓨터다.'
m = re.search(r'컴\D+', a)

print(type(m))
print(bool(m))
if bool(m) == True:   #m은 객체. 파이썬 내부 객체. 따라서 참을 판별하려면 불린함수를 써야 함.
    print(m.group())

if m:       # null이 아니면 무조건 트루라는 뜻. 더 간단해서 많이 쓰임. 자바스크립트등에서 애용.
    print(m.group())