package sec06.exam06;

public class CarExample {

	public static void main(String[] args) {
		Car myCar = new Car(); // setter메소드 호출.
	
		//잘못된 속도 변경
		myCar.setSpeed(-50); //스피드를 호출한것은 잘못된건 아니고 잘못된 숫자값을 입력
		
		System.out.println("현재 속도: " + myCar.getSpeeed()); // -50
		
		//올바른 속도 변경
		myCar.setSpeed(60);
		System.out.println("현재 속도: " + myCar.getSpeeed()); //60으로 변경
		
		//멈추는 코드
		if(!myCar.isStop()) {
			myCar.setStop(true); // car클래스에서 true 일때 0을 출력하라고 작성했음.
		}
		System.out.println("현재 속도:" + myCar.getSpeeed());
	}

}
