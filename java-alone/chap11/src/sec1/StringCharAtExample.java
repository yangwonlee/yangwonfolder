package sec1;

public class StringCharAtExample {

	public static void main(String[] args) {
		String ssn = "010101-1230123";
		char gender = ssn.charAt(7); //인덱스 번호가 7번인 것의 문자 1개 가져오기
		switch(gender) {
		case '1': //홑따옴표 써야함.
		case '3':
			System.out.println("남자입니다.");
			break;
		case '2': //홑따옴표 써야함. 또한 콜론을 써야함. 세미콜론이 아닌
		case '4':
			System.out.println("여자입니다.");
			break;
		}
		
	}

}
