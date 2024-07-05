package practice02;

public class TestExample {
	static void method(B b) {
	}
	
	public static void main(String[] args) {
		B b = (B)new A(); // 비를 casting 함. 
		
		method((B) new A());

	}

}
