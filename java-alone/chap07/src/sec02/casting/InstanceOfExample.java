package sec02.casting;

public class InstanceOfExample {
	public static void method1(Parent parent) {
			Child child = null;
			
		if(parent instanceof Child) {
			child =(Child) parent;	// 강제 형변환(casting)
			System.out.println("method1 - Child로 변환 성공");
		} else {
			System.out.println("method1 - Child로 변환되지 않음.");
		}
				
			}
	// 부모 클래스를 자식 클래스로 강제 형변환을 불완전하게 리턴하는 메소드
	public static void method2(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method2 - Child로 변환 성공.");
	}
	
	public static void main(String[] args) {
			Parent parentA = new Child();
			method1(parentA);
			method2(parentA);
			
			Parent parentB = new Parent();
			method1(parentB);
			method2(parentB);
//		method1(new Child())	//instanceof 연산자쓸때, 트루
//		method1(new Parent()) 	//인스탄스오브 -> 폴스.
		
				
				
	}

}
