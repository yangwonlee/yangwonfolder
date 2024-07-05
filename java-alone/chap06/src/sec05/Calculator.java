package sec05;

public class Calculator {
	static final double PI= 3.14159;
	// 파이는 안바뀌는 최종적인 값이니 파이널을 적용. 관례상 대문자화한다. 절대 바꾸지말라고 선언하는 것.
	static int plus(int x, int y) {
		return x + y;
		
	}
	
	static int minus(int x, int y) {
		return x - y ;  
	}
}
//이전과 다른것은 스태틱이 붙었다는 것 하나.