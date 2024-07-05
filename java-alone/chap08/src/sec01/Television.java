package sec01;

//implements로 세팅된 interface안의 모든 추상 메소드들은 반드시 class에서 구현해야 한다.
public class Television implements RemoteControl { //tv에 에러가 남. 이유는?
	private int volume; //필드(멤버 변수). 티비에서만 쓸 수 있게 프라이빗으로 접근제한.
	
	public void turnOn() { //RemoteControl에 있는 턴온 메소드
		System.out.println("TV를 킵니다.");
	}
	public void turnOff() {	//리모트컨트롤에 있는 턴오프 메소드
		System.out.println("TV를 끕니다.");
	}
	public void setVolume(int vol) {	//리모트 컨트롤에 있는 셋볼륨 메소드.
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = vol;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);

	// 구현하려는 시도는 해야함. 퍼블릭을 적어주면 오류가 안난대.
	}
}