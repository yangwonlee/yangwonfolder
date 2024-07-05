package reviewUntil200Page;

public class Page132 {
	public static void main(String[] args) {
		int x = -100;	//마이너스 백을 인트타입 x에 대입.
		int result1 = +x; //+x 즉 부호를 유지시키고 이 값이 인트타입 값이다.
		int result2 = -x; // -x 즉 부호를 바꾸고 이 바뀐 값이 인트타입 값이다.
		
		System.out.println("result1 + " + result1); //result1값을 출력하라. 
		System.out.println("result2 + " + result2); // 이하동일. 2.
		
		byte b = 100;
		//byte result3 = -b. 바이트 타입 값을 부호연산하려면 인트타입으로 바꿔야함으로 에러
		int result3 = -b;
		System.out.println("result3=" + result3);
		
		
	}
}
