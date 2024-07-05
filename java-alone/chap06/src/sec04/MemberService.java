package sec04;

public class MemberService {
	int a; // 인스턴스 멤버 변수,
	public boolean login(String id, String password) { 
// 리턴값은 불린. 메소드 이름은 로그인. 맞았음 ㅠㅠ. 로그인안에 스트링 아디비번은 못적음.
// 불린값이니 리턴이 하나 있어야 함. 무조건.	
// 인스턴스 멤버 메소드
		if (id.equals("hong") && password.equals("12345"))	
		//홍일때, 비번은 12345일때. 아디 비번이 다 맞아야하니 and. if 뒤엔 ==은 안되고
		// 무조건 .equals
			return true;
		
		return false; //무조건 폴스.안에 적힌게 아무것도 없으니.
	
	}
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
		
	}
}

//이런 형태로 개발이 많이 됨. 프로젝트할때도 많이 쓰임. 이러면 memberserviceexample의 오류가
//사라짐