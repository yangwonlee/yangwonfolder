# 사전작업: friends101.txt파일을 현재 friends.py파일의 같은 폴더에 넣기.
import os, re

print(os.getcwd())
# 여러분들의 저장경로
os.chdir(r'D:\python-prectice1\prectice_python\2024_06_25_tues\python_analysis1')

f = open('friends101.txt', 'r', encoding = 'utf-8') # 프렌즈101 대본 파일 내용 읽기모드로 열기.
script101 = f.read()

print(script101[:100])  #앞에서부터 100개의 문자 가져오기

# 첫번째 실습: 특정 등장인물의 대사만 모으기(monica의 대사만 가져오기)
Line = re.findall(r'Monica:.+', script101)
#    type(Line) ->리스트
for item in Line[:3]:
    print(item)

# Monica의 대사만 있는 monica.txt 파일 만들기
f = open('monica.txt','w', encoding='utf-8')
monicaLineScript = ''
for monicaScript in Line:
    monicaScript += monicaScript + "\n"

f.write(monicaLineScript)    
f.close()


# 두번째 실습: 등장인물 리스트 만들기.
# 등장인물 이름 모으기
# print(re.findall(r'[A-Z][a-z]+: ', script101))
# print(set(re.findall(r'[A-Z][a-z]+: ', script101)))     #에이부터 제트까지 대소문자 가리지 말고 :까지 가져와라 라는 뜻.

# 콜론과 빈 공백 제거하기.
listPeopleName = list(set(re.findall(r'[A-Z][a-z]+: ', script101)))
character = []
for peopleName in listPeopleName:
    character.append(peopleName[:-2])       #뒤에서부터 두개의 인덱스를 제거하고 character 리스트에 넣기.
    #print(peopleName[:-2])

print(character)

# 세번쨰 실습: 지문만 출력하기.
# 지문만 가져오는 정규 표현식 -> ()사이의 문자들.
print(len(re.findall(r'\([A-Za-z].+?[a-z|\.]\)', script101)))    # 괄호 앞에 문자(마침표나 따옴표등).
#|는 또는이라는 뜻. 97개로 파악완료.


# 네번째 실습: 특정 단어의 예문만 모아 파일로 저장.
# 특정 단어는 'would', 'take'
f = open('friends101.txt', 'r', encoding = 'utf-8') # 프렌즈101 대본 파일 내용 읽기모드로 열기.
sentences = f.readlines()
# 20개만 출력해서 매칭이 되는지 테스트하기.
for sente in sentences[:20]:
    if re.match(r'[A-Z][a-z]+:', sente):
        print(len(sente))
#       if sente == '':
#            continue
        print(sente[:-1])

f.close()

would_sente = ''
for sente in sentences:
    if re.match(r'[A-Z][a-z]+:', sente) and re.search('would', sente):
        would_sente += sente

f = open('friends101.txt', 'w', encoding = 'utf-8')
f.write(would_sente)
f.close()

take_sente = []
for sente in sentences:
    if re.match(r'[A-Z][a-z]+:', sente) and re.search('take', sente):
        take_sente.append(sente)

f = open('take.txt', 'w', encoding= 'utf-8')
f.writelines(take_sente)

f.close()

#Q4
d = 'I have a dog. I am not a girl. You are not alone. I am happy.'
resultd = re.split(r'\.', d)
print(resultd)

e = """Chandler: All right Joey, be nice. So does he have a hump? A hump and a hairPiece? 
Phoebe: whait,does he eat chalk? Phoebe: Just, because, I don't want her to go through what I went through with 
Carl_oh!"""
m = re.findall(r'[A-Za-z]+:', e)
M = list(set(m))
print(m)
print(M)
