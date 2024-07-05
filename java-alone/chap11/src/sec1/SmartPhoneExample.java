package sec1;

public class SmartPhoneExample {

	public static void main(String[] args) {
		//스마트폰 객체 생성
		SmartPhone myPhone = new SmartPhone("구글" , "안드로이드");

		String strObj = myPhone.toString();
		System.out.println("toString()값: " + myPhone.toString());
		
		System.out.println("myPhone객체를 system print했을 경우의 값: " + myPhone);

		System.out.println("1"); //1
		System.out.println(1); //1 내부적으로 숫자 1을 투스트링 메소드에서 문자열로 바꾸어 줘서 출력
		System.out.println(1.0); // 이하동일
		
	}

}

// Object 클래스의 가장 많이 사용하는 메소드들.
//1. equals()
//2. hashCode()
//3. toString()