package sec01;

public class SmartTelevision implements RemoteControl, Searchable {
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
	}
	public void search(String url) {
		System.out.println(url + "검색합니다."); //url은 주소. 브라우저에서 검색창을 보통 url.
		//주소창 왼쪽에 x나 빨간색이 뜨면 피싱사이트일 확률이 다분.
	}
}	
