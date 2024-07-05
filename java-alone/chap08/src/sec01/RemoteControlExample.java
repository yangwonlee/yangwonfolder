package sec01;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc1;
		RemoteControl rc2;
		
		rc1 = new Television();
		rc1.turnOn();
		rc1.setVolume(10);
		rc1.turnOff();
		
		rc2 = new Audio();
		rc2.turnOn();
		rc2.setVolume(10);
		rc2.turnOff();
	
	}

}
