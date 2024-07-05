package sec06.exam06;

public class Car {
	// 필드. 무결성을 유지하려고 필드는 프라이빗. 메소드는 퍼블릭으로 많이 씀.
	private int speed;
	private boolean stop;
	
	//생성자. 
	
	//메소드
	public int getSpeeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	
	public boolean isStop() {
		return stop;
		
	}
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
	
}
