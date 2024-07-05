package sec1;

public class Member extends Object{ 
// 생성자의 super 처럼, 내부적으로는 java.lang.Object클래스를 자동상속함. extends Object는 생략가능
	public String id; // 오브젝트를 제외한 모든 것들은 상속을 받음.

	//생성자
public Member(String id) {

	//super(); 생략. 슈퍼는 즉 오브젝트의 생성자.
	this.id = id;
	}
@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
		Member member = (Member)obj; //강제 형변환
		
		if (id.equals(member.id))
			return true;
		}
		return false;
		
	}
}

// 이러면 잘 돌아가다가 갑자기 안돌아갈 떄가 있음. 잠재적인 오류가 있는데 classcastexception 이 뜰수있음.