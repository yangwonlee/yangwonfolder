package sec07;

public class Computer extends Calculator {
	//@Override // 부모 클래스의 메소드를 재정의 하겠다고 선언.
	double areaCricle(double r) {
		System.out.println("Computer 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

}
