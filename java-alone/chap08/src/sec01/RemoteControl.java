package sec01;

public interface RemoteControl {
	// 변치않는 상수(필드). 상수여서 파이널 상시적용.
	final public int MAX_VOLUME = 10; // FINAL 상수. 상수는 대문자가 관례.
	final int MIN_VOLUME = 0; //퍼블릭 파이널 스태틱 상수. 퍼블릭, 파이널 생략 가능.

	//인터페이스는 껍데기라 생성자가 없음. 설계도마냥.
	
	// 추상 메소드
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 구현은 클래스 가서 해야 함. 구현은 객체에서. 구현은 숨기고 호출은, 그리고 배포는 인터페이스만.
}
