package sec05;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//p1.naion ="usa";
		//p1.ssn = "654321-7654321"; 파이널로 퍼슨 클래스에 저장해 놨기 때문에 불변. 오류임.
		p1.name = "홍삼원";
	}

}
