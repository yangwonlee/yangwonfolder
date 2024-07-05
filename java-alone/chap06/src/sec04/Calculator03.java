package sec04;


// 메소드 오버로딩
public class Calculator03 {
	int plus(int x, int y) {
		return x + y;
	}
	
	double plus(double x, double y) { // 더블이 아니고 인트였으면 완전 같으니 오류.
		return x + y ; // 다른 메소드가 되었으니 오버로딩에 해당.
	}
	void println(String s) {
		
	}
	void println(int a) {
		
	}
}
