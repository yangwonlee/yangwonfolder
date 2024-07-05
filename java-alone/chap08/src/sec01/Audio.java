package sec01;

public class Audio implements RemoteControl {
private int volume; //필드(멤버 변수). 티비에서만 쓸 수 있게 프라이빗으로 접근제한.
	
	public void turnOn() { //RemoteControl에 있는 턴온 메소드
		System.out.println("Audio를 킵니다.");
	}
	public void turnOff() {	//리모트컨트롤에 있는 턴오프 메소드
		System.out.println("Audio를 끕니다.");
	}
	public void setVolume(int vol) {	//리모트 컨트롤에 있는 셋볼륨 메소드.
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = vol; //인수를 받음.
		}
		System.out.println("현재 Audio 볼륨: " + this.volume);
	}
	// 구현하려는 시도는 해야함. 퍼블릭을 적어주면 오류가 안난대.

	
	

	}

