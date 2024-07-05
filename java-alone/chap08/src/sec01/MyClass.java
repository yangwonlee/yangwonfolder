package sec01;

public class MyClass {
	//필드
	RemoteControl rc = new Television();
	
	// 생성자
	MyClass(){ //인수가 하나도 없는 기본생성자.
		
	}
	
	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);		//인수가 두개인 생성자.
	}
	
	//  메소드
	void methodA() {	//오디오 키는 메소드
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
	void methodB(RemoteControl rc) { //티비 키는 메소드
		rc.turnOn();
		rc.setVolume(5);
	}
	
	
}
