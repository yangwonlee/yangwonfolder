package sec02.casting;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child(); //자동 형변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2(); //객체를 호출해야 해서 소문자 p.
		
//		parent.field2 = "data2";
//		parent.method3();	//페런트에는 필드2랑 메소드3은 없음. 객체를 받을때 패런트떄 다 받아서 불가

		
		Child child = (Child) parent; // 강제형변환. 이러면 오류해결. 캐스팅을 빼면 오류. 괄호도중요.
		child.field2 = "data2";
		child.method3();
		
		/*
		Parent parent2 = new Parent(); //이 뉴 페런트는 자기자신의 패런트를 받음.
		Child child2 = (Child) parent2;
		child2.field2 = "data2";
		child2.method3(); //런타임 에러. */
	}
}
