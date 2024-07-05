package sec05;

public class CalculatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double result1 = 10 * 10 * Calculator.PI;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		Calculator cal1 = new Calculator();/* 객체를 만듦. 그러나 이를 하지 않은 이유는
		메소드 영역에 잡고 실행을 해주게끔 함. 정적멤버가 있어서 가능 */
		//cal1. /*하면 오른쪽에 저장된 메소드나 스태틱, 필드들을 불러올 수 있음. 그중 빨간색으로 s라고
		//조그만하게 적힌 것들은 static이라는 것. 녹색으로 된 구형은 일반 객체라는 뜻. 흰색빈 세모는필드.
		//안에 초록 세모는 메소드. */
		double result12 = 10 * 10* cal1.PI;
		int result22 = cal1.plus(10, 5);
		int resul32 = cal1.minus(10, 5);
		// static로 된 멤버들은 객체에서 호출하는것을 지양. 또한 노란 밑줄은 워닝 표시. 지양이 맞음.
		// 되긴하지만 쓰면 혼난대.
		
	}

}
