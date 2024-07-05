package practice02;

public class MemberService extends Service {
	public void login() {
		System.out.println("멤버 로그인");
	}
}

// 멤버서비스 파일과 서비스파일을 따로 쓴 이유는 자바는 파블릭 클래스를 하나밖에 못써서.
//왜냐면 파블릭이 이상한걸 만지면 혼선이 오기 때문.