package sec01;

public class MyClassExample {

	public static void main(String[] args) {
		// 1 ) 티비1을 킨다.
		System.out.println("!)---------------------------------");
		
		MyClass myClass1 = new MyClass();
		myClass1.rc.turnOn();
		myClass1.rc.setVolume(5);
		
		//2) 오디오1을 킨다.
		System.out.println("2)----------------------------");
		MyClass myclass2 = new MyClass(new Audio());
		
		// 3) 오디오2를 킨다.
		System.out.println("3)---------------------------------------");
		
		MyClass myClass3 = new MyClass();
		myClass3.methodA();
		
		// 4) tv2을 킨다.
		System.out.println("4)-------------------------------------------");
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
	}

}
