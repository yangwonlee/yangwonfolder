package sec04;

public class Car {
	//필드.
	int gas;
	
	// 생성자. 생략됨. 그렇다면 기본 생성자가 출력되겠지.
	
	void setGas(int gas) {
		this.gas = gas; // 가스를 세팅하는 것.
	}
	
	boolean isLeftGas() { //논리타입, 가스가 남아있다면
		if(gas==0) { // 만약 가스가 0이라면
			System.out.println("gas가 없습니다."); // 가스가 없습니다.를 출력.
			return false; //false값을 반환하라.
		}
		System.out.println("가스가 있습니다."); // 가스가 있습니다가 출력된다면
		return true; // true값을 반환하라.
	}
	
	void run() { // 달린다는 메소드함수. 메소드니 동작을 의미. 리턴값은 0. void니까.
		while(true) { // 트루값이 반환되었을 때, 
			if(gas > 0) { //가스가 만약 0 이상이라면
				System.out.println("달립니다.(gas잔량: " + gas + ")");
				gas -= 1; // 달립니다를 출력하고, 괄호안에 잔량을 표기하라. 
			}else { //그리고 가스의 양을 1씩 줄이고. 그렇지 않으면?
				
			System.out.println("멈춥니다.(gas잔량: " + gas + ")");
			return; //멈춥니다를 실행하라. run 메소드 실행 종료.  
			}
		}
	}
	
	
}
