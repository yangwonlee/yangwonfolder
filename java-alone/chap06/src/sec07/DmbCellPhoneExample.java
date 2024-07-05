package sec07;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone 
			= new DmbCellPhone("자바폰", "검정", 10);
		
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);
		//DmbCellPhone의 필드
		System.out.println("채널: "+ dmbCellPhone.channel);
		
		// cellphone으로부터 상속받은 메소드를 호출
		
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();	//디엠비 셀폰에서 상속받았기 때문에 코딩 가능.
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요! 저는 이양원입니다.");
		dmbCellPhone.sendVoice("아~ 예 반갑습니다.");
		dmbCellPhone.hangUp();
		
		//dmbcellphone 클래스의 메소드 호출
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		DmbCellPhone dmbCellPhone2
			= new DmbCellPhone();
	}

}
