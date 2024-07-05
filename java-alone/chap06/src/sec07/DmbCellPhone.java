package sec07;

public class DmbCellPhone extends CellPhone {
	int channel; //디엠비가 가지는 채널 속성을 생성.
	
	public DmbCellPhone() {
		super(); //cellphone의 기본 생성자 호출. // 얘도 없어도 호출됨.
	}
	// 생성자
	public DmbCellPhone(String model, String color, int channel) { //가상으로 인수들을 세팅. 모델과 채널은 가상.
		//super(); 해당 코드가 없어도 자동으로 만들어짐.
		this.model = model; // 이 this.model은 셀폰에 있는 모델. 상속을 받아서 가능. 
		//접근제한자 default는 같은 패키지 안에서 가져올 수 있음. 뒤의 model은 매개변수 model.
		this.color = color;
		this.channel = channel;
	}

	//메소드. 이 안에서만 쓰이는 메소드.
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	void turnOffDmb() { // 이름들은 cellphone이랑 같으면 충돌나기때문에 바꿔줘야 함.
		System.out.println("DMB 방송 수신을 멈춥니다.");
		}
	
	}
	

