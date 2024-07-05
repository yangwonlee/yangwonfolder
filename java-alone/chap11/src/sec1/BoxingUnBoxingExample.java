package sec1;

public class BoxingUnBoxingExample {

	public static void main(String[] args) {
		
		//Boxing
		
		Integer obj1 = new Integer(100); //밑줄은 deprecated된 것을 표현. 디프리케이트는 더이상 안쓴다는 말. 지워도 된다는 뜻. 근데 이번엔 걍 쓸래
		Integer obj2 = new Integer("200");
		Integer obj3 = new Integer(300);
		
		// 언박싱
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);

	}

}
