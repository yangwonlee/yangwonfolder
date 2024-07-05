package sec1;

public class MemberExample {

	public static void main(String[] args) {
		Member obj1 = new Member("blue"); //블루는 아이디.
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");

		//재정의한 equals 함수 때문에 오브제1과 오브제2는 같음("blue == blue")
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		
		// 두 객체가 같다라는 의미는 아래와 같다
		//-> == 
		//-> hashcode의 리턴 숫자값이 같고 equals메소드에서 리턴값이 true인 경우
		
		// 재정의한 equals 함수로 오브제1과 오브제3은 다름("blue != red")
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3은 동등합니다.");
		}else {
			System.out.println("obj1과 obj3은 동등하지 않습니다.");
		}
		
	}

}
// hash = 유일하다 라는 뜻. 해시코드는? 유일무이한 코드.