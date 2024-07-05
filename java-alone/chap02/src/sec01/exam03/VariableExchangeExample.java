package sec01.exam03;
// 변수값 교환. x와 y를 교환하는 방법.
public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x:" + x + ", y:" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x:" + x + ", y:" + y);
	}
}
// 이클립스는 파란색글자가 변수.