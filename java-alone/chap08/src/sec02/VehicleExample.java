package sec02;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		vehicle.run();// 버스가 달립니다.
		//vehicle.checkFare(); //에러. 비히클 인터페이스는 체크페어메소드가 없다.
		
		Bus bus = (Bus)vehicle; // 강제 형변환(casting)
		bus.run();
		bus.checkFare(); // Bus의 객체인 bus에서 체크페어 메소드가 존재함으로 실행가능.

	}

}
