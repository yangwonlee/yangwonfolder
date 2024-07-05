package sec03;

// Member user1 = new Member("홍길동", "hong")
public class Member {
	String name;		//field
	String id;			//field. 우클릭-> 소스 -> 제네레이팅 컨스트럭터 유징 필드. 실행
						//하면 바로 밑에 문장이 나옴.
	public Member(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public Member() {

	}
	
	public Member(String name, String id) {
		this.name =name;
		this.id = id;
	}
}
