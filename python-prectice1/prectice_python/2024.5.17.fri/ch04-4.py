print('ch04-4실행됨')   # 난 내피시, 로컬 디스크d. 프렉티스 파이선, 데이8에 다운되어있음. ch04-4.py가.

import sys

args = sys.argv[1:] 
for i in args:  # 저장하고 다시 쓰면 되는거였어. 알겠냐. 아래 파이썬에 aaa bbb ccc를 쓰면, 1번 이후부터 
    print(i)    # 나옴. 0번은 sys1.py. aaa는 1이기 때문. 그래서 aaa bbb ccc가 나온 것. 인덱스 슬라이싱한거니
    # 뒤에 띄어쓰기까지 합쳐서 인수를 넣어주는 것.