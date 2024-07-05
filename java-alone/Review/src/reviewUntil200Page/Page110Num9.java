package reviewUntil200Page;

public class Page110Num9 {
	public static void main(String[] args){
		long var1 = 2L;
		float var2 = 1.8f;
		double var3 = 2.5;
		String var4 = "3.9";
		int result = (int)var1 +(int)(var2 + var3) 
				+ (int)Double.parseDouble(var4);
		
		System.out.println(result);
		
		
	}
}
// 2는 정수형으로 그대로. 1.8+ 2.5=4.3을 정수형으로. 소숫점버리고 4. 2+4= 6. 3.9를 정수형.
// 정수형 한 후 정수형. 6+3= 9

//인트에는 괄호로. ()타입.함수 이런식으로 적는 것임.


