package sec04;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.setGas(5); //car의 setGas() 메소드 호출
		
		boolean gasState = myCar.isLeftGas(); //카의 이즈레프트 메소드 호출?
		if(gasState) {
			System.out.println("출발합니다.");
			myCar.run(); //카의 런 메소드 호출
		}
		
		if(myCar.isLeftGas()) { //카의 이즈레프트가스 메소드
			System.out.print("gas를 주입할 필요가 없습니다.");
		}else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
// 리턴은 파이썬의 리턴과 백퍼센트 동일.