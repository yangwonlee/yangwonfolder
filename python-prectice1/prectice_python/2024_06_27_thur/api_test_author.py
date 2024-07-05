import requests     # api호출 패키지
from bs4 import BeautifulSoup   # json 혹은 xml을 parsing하는 패키지

api_key = 'q1Adal+90LqdL8K5JMqLyXrVRzlj4/GTPAFbv8gKoX42'
base_request_url = f'http://apis.data.go.kr/9720000/searchservice/basic?serviceKey={api_key}&pageno=1&displaylines=10&search=자료명,미국' 
#인증키. 공공데이터포탈 마이페이지에서 인증키 복사 가능

response = requests.get(base_request_url)
soup = BeautifulSoup(response.text, 'lxml')

print(soup.prettify())