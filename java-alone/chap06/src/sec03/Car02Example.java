package sec03;

public class Car02Example {

	public static void main(String[] args) {
		Car02 car1 = new Car02();// 클래스 이름이 바꼈으니 02. 2트
		System.out.println("car1.company : " + car1.company);
		System.out.println();
		
		Car02 car2 = new Car02("자가용");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		Car02 car3 = new Car02("자가용", "빨강");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		Car car4 = new Car("택시", "검정", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
	}

}
