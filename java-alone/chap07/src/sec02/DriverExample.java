package sec02;

public class DriverExample {
	public static void main(String[]args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);	// 버스가 닫힙니다. 실제 넘기는건 자식개체. 
		// 자식개체의 런이 실행됨. vehicle의 런이 아님.
		driver.drive(taxi); // 택시가 닫힙니다.
	}
}
