package sec1;

public class StringGetBytesExample {

	public static void main(String[] args) {
		String str1 = "안녕하세요"; //안-> ㅇ ㅏ ㄴ .3bytes
		String str2 = "hello";	//h => h hot .끝의 종성까지 합쳐서 3바이트
		
		byte[] bytes1= str1.getBytes(); //인코딩. 바이트로 바꾸는 것. 아무것도 적지않으면 utf 8
		System.out.println("Byte1.length: " + bytes1.length); //3bytes* 5 = 15개
		byte[] bytes2= str2.getBytes();
		System.out.println("Byte2.length: " + bytes2.length); //1byte * 5 = 5개

	String str3 = new String(bytes1); //안녕하세요 //디코딩 // 숫자로 바꾸는 것.
	System.out.println("bytes1 => String:" + str3); //안녕하세여
	
	String str4 = new String(bytes2);
	System.out.println("bytes2 => String:" + str4); // hello
	
	
	
	try {
		//euc-kr(대소문자 구분 x) -> 한국어 인코딩 타입이름
		//utf-8(대소문자 구분 x) -> 다국어 인코딩 타입이름
		
		byte[] bytes3 = str1.getBytes("euc-kr"); // euc-kr은 2바이트 ex) 아ㄴ -> 2바이트
		System.out.println("bytes3.lenth: " + bytes3.length); // 2바이트*5 =10개
		//euckr로 인코딩
		String str5 = new String(bytes3, "euc-kr"); // euc-kr로 디코딩
		System.out.println("bytes3 -> String: " + str5); //안녕하세요
	
		
		byte[] bytes4 = str1.getBytes("utf-8"); // euc-kr은 2바이트 ex) 아ㄴ -> 2바이트
		System.out.println("bytes4.lenth: " + bytes3.length); // 2바이트*5 =10개
		//euc-kr로 인코딩
		String str6 = new String(bytes4, "utf-8"); // euc-kr로 디코딩
		System.out.println("bytes4 -> String: " + str6); //안녕하세요
		
	
	} catch(Exception e) {
		e.printStackTrace();
	}
	}

}
