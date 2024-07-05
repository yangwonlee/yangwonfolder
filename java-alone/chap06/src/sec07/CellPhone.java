package sec07;

public class CellPhone {
	//필드
	String model; //모든 폰엔 모델이 있고
	String color; // 모든 폰엔 색이 있음. 따라서 공통속성이 있어서 필드로 선언을 함.
	
	public CellPhone() {
		System.out.println("CellPhone() 생성자 호출됨.");
	}
	
	// 메소드
	void powerOn() {System.out.println("전원을 켭니다.");}
	void powerOff() {System.out.println("전원을 끕니다.");}
	void bell() {System.out.println("벨이 울립니다.");}
	void sendVoice(String message) {System.out.println("자기: " + message);}
	void receiveVoice(String message) {System.out.println("상대방: " + message);}
	void hangUp() {System.out.println("전화를 끊습니다.");} //추상한 것을 메소드화. 
}
