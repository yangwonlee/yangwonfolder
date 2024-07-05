package sec01.exam01;

public class VariableInitializtionExample {
	public static void main(String[] args) {
		// 변수 value 선언후 초기화. 밸류 뒤에 숫자를 넣어주지 않으면 오류가 뜸.
		int value = 20;
		
		//변수 value 값을 읽고 10을 더하는 산술 연산을 수행
		// 연산의 결과값을 변수 result의 초기값으로 지정
		int result = value + 10;
		
		//변수 result 값을 읽고 콘솔에 출력. 콘솔은 하단에 나오는 값들이 들어간 네모칸들.
		System.out.println(result);
	}
}
