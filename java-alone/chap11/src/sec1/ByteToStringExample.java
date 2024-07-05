package sec1;

public class ByteToStringExample {

	public static void main(String[] args) {
		//아스키코드 표 참조
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97 };
		
		// 숫자된 것을 문자로 변경
		
		String str1 = new String(bytes);
		System.out.println(str1); //Hello Java
		
		String str2 = new String(bytes, 6, 4); //인덱스번호 6번부터 시작해서 4번까지 가져오기
		System.out.println(str2);		
	}

}
