package sec07;

public class Student extends People { //사람이 가진 공통적인 특성을 상속받음. 이름과 ssn.
// 스튜던트에 에러가뜨는 이유는 기본 생성자가 없어서 그럼. 
	public int studentNo;
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 부모가 가지는 2개의 인수를 가진 생성자 호출. 스튜던트 노를 초기화하려면?
		
		this.studentNo = studentNo; // 이렇게 초기화하면 됨.
	}
}
