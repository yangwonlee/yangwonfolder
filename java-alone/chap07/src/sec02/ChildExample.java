package sec02;

public class ChildExample {

	public static void main(String[] args) {
		Child child = new Child();
		Parent parent = child; // 클래스 자동 형변환;
		
		parent.method1(); // 패런트에 있는것만 실행 가능. method 3은 실행이 안됨.
		parent.method2(); // parent의 method2 가 아니라 child의 메소드 2가실행됨. 지가갖고있는거니.
		// 자동형변환은 부모것이 아닌 자식것이 됨. 객체 지향에 있어서 굉장히 중요한 내용.
		//parent.method3() ; // error
	
	}
	

}
