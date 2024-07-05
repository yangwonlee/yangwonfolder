package reviewUntil200Page;

public class Page113 {
	public static void main(String[] args) {
		
		int value = 123;//정수형의 값은 123. 숫자다. 문자가 아니고
		
		System.out.printf("상품의 가격:%d원\n" , value);
		// 형식 문자열을 출력하라. 그 문자열은 "상품의 가격:정수형 원. 줄바꿔서 밑줄에 값."
		System.out.printf("상품의 가격:%6d원\n", value);
		// 형식 문자열을 출력하라. 그 문자열은 상술. 단 6d라고 했으니 6자리인 정수로 표현하라.
		System.out.printf("상품의 가격:%-6d원\n", value);
		// 이하 동일. 단 -6d는 6자리인 정수. 추가적으로 오른쪽에서 공백을 밀어넣어라.
		System.out.printf("상품의 가격:%06d원\n" , value);
		//이하 동일. 공백대신 0을 넣으라는 뜻.
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.2f\n", 10, area);
		//실수형 면적값은 3.14159에 10을 제곱한다.
		
		String name = "홍길동";
		String job = "도적";
		
		System.out.printf("%6d : %-10s : %10s\n" , 1 , name , job);
		//%6d에 1을 대입. 앞에 6자리를 띄고 1. 그후에 : %-10s에 name 대입. 오른쪽에
		// 열칸 띄움. %10s\n에 잡 대입. 왼쪽에 10칸 띄우고 잡. 사이는:로 구분.
	}
}
