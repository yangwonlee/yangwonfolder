import usecsv
import os

print(os.getcwd())
os.chdir(r'D:\python-prectice1\prectice_python\2024_06_26_wed')

a = [['국어','영어','수학'],[99,88,77]]
usecsv.writecsv('test.csv', a)

total = usecsv.opencsv(r'D:\python-prectice1\prectice_python\2024_06_26_wed\popSeoul2023.csv')
print(usecsv.switch(total))