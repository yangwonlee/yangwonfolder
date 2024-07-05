package sec1;

public class StringIndexOfExample {

	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍"); 
		// location은 3. 즉 프로그래밍이라는 글자는 몇번째 인덱스에 있는지를 리턴해줌.
		System.out.println(location);
		
		if(subject.indexOf("자바") == -1) { //서브젝트에 자바 라는 문자열이 없다면 -1 있으면 몇번째 인덱스에 있ㄴ는지 리턴
		System.out.println("자바와 관련된 책이군여.");
		}else {
		System.out.println("자바와 관련된 책이 아니군요.");
		}
		
		//length 함수는 글자수의 개수값을 리턴.
		System.out.println(subject.length()); //8
	}

}
