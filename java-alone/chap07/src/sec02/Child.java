package sec02;

public class Child extends Parent { // 똑같은 이름인 메소드2임에도 오류가 나지 않는 이유는 상속받아서. 
	//= extends. 우선순위의 차이가 있을 뿐.
	void method3() {
		System.out.println("Child의 method3");
	}
	@Override
	void method2() {
		System.out.println("Child의 method2");
	}
}
