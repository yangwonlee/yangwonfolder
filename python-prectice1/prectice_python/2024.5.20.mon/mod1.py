def add(a, b):
    return a + b

def sub(a, b):
    return a - b

print(add(1, 4))
print(sub(4, 2))


# __name__은 모듈이름을 출력한다.
if __name__ == "__main__":      #모듈로 사용할 시 아래 명령문을 실행하지 않도록 한다.
    print(add(1, 4))    #5
    print(sub(4, 2))    #2
    pass