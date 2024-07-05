package sec01;

public class NumberFormatExceptionExample {

	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100";

		// 문자열 데이터 1 100을 숫자 100으로 변경 시도
		// 문자열 데이터 2 에이백을 숫자로 변경 시도
		//	a100중 a는 변경이 불가능해서 넘버포맷익셉션이 발생
		int value1 = Integer.parseInt(data1);
		
		int value2 = Integer.parseInt(data2); // a를 숫자로 바꿀 수 없어서.
	}

}
