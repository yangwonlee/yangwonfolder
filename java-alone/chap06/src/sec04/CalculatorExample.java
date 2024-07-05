package sec04;

public class CalculatorExample {
	
	public static void main(String[] args) {
		Calculator myCalc = new Calculator();// MY CAR라는 객체를 생성
		myCalc.powerOn();	// 메소드인 보이드 파워온을 실행.
		
		int result1 = myCalc.plus(5, 6); //리턴값을 리절트 1로 받음.
		System.out.println("result1: " + result1);
		
		byte x = 10;	// 인트 엑스랑 와이. 바이트는 인트보다 작으니까 
		//10으로 값이 전달되면 내부적으로는 인트로 바뀜. 엑스가 인트형이 되지만 나누기를 했을떄 
		//소수점을 하려면 더블로 사용. 이것을 리턴해서 2.5
		byte y = 4;
		double result2 = myCalc.divide(x, y); //리절트는 그래서 2.5
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();// 리턴값이 없으면 보이드. 전원을 끕니다라는 콘솔만 리턴
		
	}
}
