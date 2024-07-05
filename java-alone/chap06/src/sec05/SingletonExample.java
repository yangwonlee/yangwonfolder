package sec05;

public class SingletonExample {

	public static void main(String[] args) {
		//Singleton obj1 = new Singleton(); // 에러. 싱글톤 클래스에서 프라이빗으로 막았기 때문.
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance(); //싱글톤 오브제1이랑 2는 같음. 
		
		if(obj1 == obj2) {
			System.out.println("같은 Singleton 객체 입니다.");
		}
	}

}
