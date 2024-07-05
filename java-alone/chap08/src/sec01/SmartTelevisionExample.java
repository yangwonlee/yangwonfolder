package sec01;

public class SmartTelevisionExample {

	public static void main(String[] args) {
		SmartTelevision tv1 = new SmartTelevision();
		
		RemoteControl rc = tv1; //티비 1로 대입. 알씨는 티비1의 인터페이스를 실행 가능.
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		Searchable sa = tv1;
		sa.search("www.naver.com");
	}

}
