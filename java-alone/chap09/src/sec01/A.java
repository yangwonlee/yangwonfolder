package sec01;

public class A {
	//인스턴스 멤버 중첩 클래스
	public class B{ // 클래스 안의 클래스.
		//생성자
		B(){
			System.out.println("B객체가 생성됨");
		}
		
		//필드
		int field1;
		
		// 메소드
		
		void method1() {}
		
	}
}
