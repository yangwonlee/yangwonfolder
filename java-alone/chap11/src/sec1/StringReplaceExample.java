package sec1;

public class StringReplaceExample {

	public static void main(String[] args) {
		
		//replace 메소드 사용
		String oldStr = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 지원합니다.";
		String newStr = oldStr.replace("자바", "JAVA"); //바꿔야 하는 문자(왼쪽)를 바꿀문자로 변경. 파이썬에서도 있었음. 똑같이.
		System.out.println(oldStr);
		System.out.println(newStr);
// replace말고도 리플레이스 올도 있음 all.
		
		//문자열 잘라내기로 substring메소드 사용.
		String ssn = "960924-1234567";
		
		String firstNum = ssn.substring(0,6); //왼쪽은 시작인덱스 오른쪽은 가져올 만큼의 문자열의 인덱스 번호
		System.out.println(firstNum); // 960924
		
		String secondNum = ssn.substring(7); //시작 인덱스 번호부터 끝의 인덱스 번호까지의 문자열 가져오기
		System.out.println(secondNum); // 1234567
		
	}

}
