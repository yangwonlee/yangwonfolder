package sec02;

public class Carexample {

	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car();
		
		// 필드값 열기
		System.out.println("제작회사: " + myCar.company);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		// 필드에 접근할때 . 필드이름 으로 접근. 메소드도 동일. 괄호가 있으면 메소드 없으면 필드
		// 필드 값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed);
	}

}
