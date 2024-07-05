package sec04;

public class MemberSeriveExample {
	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");// 로긴이라는 메소드가 멤버 서비스에 만들어져야 빨간색이 찾아서 없어지게 됨. 여기까진 파악했음.
//불린 리절트는 이프 리절트쪽에 영향을 줌 로그아웃이라는 메소드 역시 로긴과 동일.
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		}else {
		System.out.println("id 또는 password가 올바르지 않습니다.");	
		}
		
	}
}
