package sec07;
// 부모.
public class People {
	public String name;
	public String ssn;
	
	public People(String name, String ssn) {
		this.name = name; //this.name = 위에 퍼블릭으로 선언한 필드 멤버. 스트링 네임. 노말 네임은 퍼블릭 피플 안의 스트링 네임.
		this.ssn = ssn;
	// 기본 생성자가 없는 케이스.	
	}
}
