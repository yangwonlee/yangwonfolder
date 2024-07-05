package sec02;

public class CarExample {
	public static void main(String[] args) {
		Car myCar = new Car(); //차 한대 출고

		myCar.run(); // 한국 타이어가 굴러갑니다.
		
		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRightTire = new KumhoTire();
		
		myCar.run(); // 한국 타이어가 굴러갑니다. x 2, 금호타이어가 굴러갑니다.
		
	}

}
