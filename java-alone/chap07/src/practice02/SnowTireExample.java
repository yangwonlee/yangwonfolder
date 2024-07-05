package practice02;

public class SnowTireExample {

	public static void main(String[] args) {
		SnowTire snowTire = new SnowTire();
		Tire tire = snowTire; //승진되서 타이어의 런이 실행되는것이 아닌 스노우타입의 런.
		
		snowTire.run();
		tire.run();

	}

}
