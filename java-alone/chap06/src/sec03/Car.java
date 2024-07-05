package sec03;

public class Car {
	public Car() { // 기본 생성자 선언. 인수값이 없는게. 위에 클래스 이름이랑 꼭 같아야한다
// 만약 기본 생성자가 만들어 지지 않더라도 내부적으로 기본 생성자가 없다면 자동으로 만들어 줌.
		System.out.println("기본 생성자 출력");
	} 
	public Car(String model, String color, int maxSpeed ) {//3개의 인수를 가진 
		//생성자.
		System.out.println("인수가 3개인 생성자 출력");
	}
	
	public Car(String color, int cc) {
		System.out.println("인수가 2개인 생성자 출력");
	}
	
}

	//다른 생성자가 있으면 기본생성자는 자동생성되지 않음. 우리가 스스로 만들어야함. 
//책 257p에서 기본생성자가 오류가 난 이유는 기본생성자가 없었기 때문. 우린 만들었으니 오류x