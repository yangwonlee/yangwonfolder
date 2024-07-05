package sec07;

public class ChildExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child child = new Child();
		
		child.method1(); //차일드에 메소드 1번은 없다. 되는 이유는? 부모걸 상속받아서. extends덕에.
		child.method2(); // 메소드 2번은 차일드랑 패런트에 있음. 이때는 본인이 만들어 놓은게 더 우선순위
		//상속보단 본인이 만든게 우선.
		child.method3(); // 본인거니까 그냥 만듦.

		Parent parent = new Parent(); //할아버지 클래스가 없어서 메소드1,2밖에 못씀.
		//parent.method3(); //오류. 차일드의 메소드3은 없으니 오류.
		parent.method2(); //부모는 자식에게 손빌리기 싫어하니 자기것을 쓴다. parent의 메소드2
//		ㄴㄴ 부모와 자식의 메소드 이름이 같다면 자식의 이름으로 오버라이딩 된다. 오버라이트와 비슷한 개념
	}

}
// 메소드 재정의.