# 23년 8월 부동산 시거래가 데이터(apt2308.csv) 전처리 및 분석
# 강원도에 120m2이상 3억원 이하인 아파트만 검색한 결과를 csv파일로 저장.
import os, re
os.chdir(r'D:\python-prectice1\prectice_python\2024_06_26_wed')    # 실거래가 정보파일을 저장한 폴더,
import usecsv   #앞에서 만든 usecsv를 불러옴
apt = usecsv.switch(usecsv.opencsv('apt2308.csv'))  #opencsv함수로 csv형 리스트 불러오고 switch함수 사용
apt[:3]
#print(len(apt))

# print(apt[0])
# for i in apt[:6]:
#     print(i[0])

# for i in apt[:6]:
#     print(i[0], i[4], i[8])

# for i in apt:
#     try:
#         if i[5]>= 120 and i[8] <= 30000 and re.match('강원', i[0]):
#             print(i[0], i[4], i[8])
#     except: pass

# new_list = []

# for i in apt:
#     try:
#         if i[5] >= 120 and i[8] <= 30000 and re.match('강원', i[0]):
#             new_list.append(i[0], i[4], i[8])
#     except: pass

# usecsv.writecsv('over120_lower30000.csv', new_list)

# 전용 면적이 60이하인 아파트 검색해보기

new_list = []
for i in apt:
    try:
        if i[5] >= 60 and re.match('강원', i[0]):
            new_list.append(i[0], i[4])
    except: pass

usecsv.writecsv('lower60.csv', new_list)