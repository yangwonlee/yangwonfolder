package sec1;

public class SmartPhone {
	private String company;
	private String os;	//리눅스등을 뜻하는 os
	
	//constructor
	public SmartPhone(String company, String os) {
		super();
		this.company = company;
		this.os = os; // 우클릭 -> source -> generator constructor using field 클릭하면
		//바로 나옴
	}
	// method
		@Override
		public String toString() { //투 스트링은 인수값이 없음.
			System.out.println("SmartPhone의 toString()이 실행됨.");
			return company + ", " + os; //회사이름 콤마 오에스를 쓰겠다고 재정의함. 
			// sysout으로 투스트링이 실행된다는 뜻.
		}
	
	
	}


 

	


