package reviewUntil200Page;

public class Page103 {
	public static void main(String[] args){
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = bytevalue1 + bytevalue2; -> 컴파일 에러
		//왜? 바이트랑 바이트랑 더하면 인트가 나와야함.
		int intValue1 = byteValue1 + byteValue2; //이것처럼. ㅋㅋ 바로나와있었네.
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//charValue3 = charValue1 + charValue2; -> 컴파일 에러. 얘도 바이트와 상동.
		int intValue2 = charValue1 +charValue2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4 =intValue3/4; //인트 밸류 3을 4로 나눈것. 즉 2.5 0.75가 아닌
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10/4.0; -> 인트함수는 정수만 나와야하니까. 컴파일에러.
		double doubleValue = intValue5 / 4.0; // 바꾼 더블밸류는 인트밸류5, 즉 10에서 4를 나눈 값. 2.5가 된다.
		System.out.println(doubleValue);
		
		int x = 1;
		int y = 2;
		double result = (double) x/y;
		System.out.println(result);
	}
}
