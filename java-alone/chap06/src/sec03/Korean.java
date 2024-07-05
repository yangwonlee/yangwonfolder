package sec03;

public class Korean {
	String nation = "대한민국";
	String name;
	String ssn;
	
	public Korean(String n, String s) {
		this.name = n;
		this.ssn = s; //디스는 클래스 자체, 즉 코리안을 지칭. this뒤에 반드시 .
	}
}
