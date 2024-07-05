package sec04;

public class ClassName {
	int method1(int x, int y) {
		int result = x + y;
		return result;
	}
	
	int method2() {
		int result1 = method1(10, 20); // 내부 메소드(method1) 호출
		double result2 = method1(10, 20);
		 // 클래스 내부에서 다른 메소드를 호출. 위에있는 메소드 호출한 것.
		// 자동 형변환이 되서 30.0이 됨. result2를 던져주면 잘리겠지만 던질 순 있음.
		//보이드 메소드2로 선언한다면 리절트 라인은 상관이 없음.
	}
}
