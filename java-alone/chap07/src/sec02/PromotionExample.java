package sec02;

	class A {}
	
	class B extends A{
	}
	class C extends A{
	}
	class D extends B{
	}
	class E extends C{
	}
	
	// 자동 타입 변환(promotion) -> 자식 클래스의 객체는 부모 객체로 형 변환 시 자동 형 변환이 됨.
	
	public class PromotionExample { // 클래스 안에 또 클래스를 쓸 수 없다. 맨 위에 클래스를 적어서
		//빨간줄이 나왔음.
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//B b3 = e; // e는 B를 상속받지 않았기 떄문에 자동 형변환이 이루어질 수 없음.
		//C c2 = d; // d는 C를 상속받지 않았기 떄문에 자동 형변환이 이루어질 수 없음.
	 }
	}

