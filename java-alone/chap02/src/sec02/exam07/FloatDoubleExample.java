package sec02.exam07;

public class FloatDoubleExample {
	public static void main(String[] args) {
		// 실수값 저장
		// float var1 =3.14
		float var2 = 3.14f;
		double var3 = 3.14;
		
		//정밀도 테스트
		float var4 = 0.1234567489f;
		double var5 = 0.12345674895647886987;
		
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.out.println("var5: " + var5);

		boolean a1 = true;
		boolean a2 = false;
		
		boolean stop = true;
		if (stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
			
		}
		
	}
}
		
		/* 2-2-1 200; 127 이상이라 불가. 
		2-2-2 char 뒤에는 한글자만.
		2-2-3 var65는 가능. 정답.
		2-2-4 마지막에 L문자가 빠짐. Long var으로 선언되면 마지막엔 l붙여야함.
		f처럼.
		2-2-5 float var =3.14;는 마지막에 f가 없어서. 2-2-4와 같은 이유로 틀림
		2-2-6 정답. 더블은 암것도 없어도 됨.
		2-2-7 쌍따옴표대신 \\가 들어가야 에러가 안남. ""는 에러남.
		2-2-8 불린인데 0이 맞냐? 0은 폴스나 트루값이 들어와야지 0은안됨. 파이선과다르게
		2-2-9,10은 범위가 달라서 그럼. 무시. e라서.
		
		2-3 "자바는
		재미있는" 프로그래밍 언어
		입니다" 로 출력
		
		*/
		
		
		

