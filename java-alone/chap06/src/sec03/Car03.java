package sec03;

public class Car03 {
	String company= "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	Car03(){
		
	}
	
	Car03(String model) {
	this(model, null, 0); // 밑에 있는 3개의 매개
	}
	
	Car03(String model, String color){
		this(model, color, 0); // 밑에 있는 3개의 매개
	}
	Car03(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
}
// 