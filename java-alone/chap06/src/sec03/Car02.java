package sec03;

public class Car02 {
	// 필드
	String company ="현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car02(){
	}
		
	Car02(String model) {
		this.model = model;
	}
		
		
	Car02(String model, String color){
		this.model = model;
		this.color = color;
	}

	Car02(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}		
}

// 클래스랑 네임이랑 같아야함. car이 아닌 2도 아닌 02로. 아까까지 오류났던 이유.