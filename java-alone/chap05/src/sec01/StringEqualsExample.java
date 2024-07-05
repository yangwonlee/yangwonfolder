package sec01; //195페이지.

public class StringEqualsExample {
	public static void main(String[]args) {
		
		String strVar1 = "신민철";	//String은 참조타임(reference type)
		String strVar2 = "신민철";
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1과 strVar2는 참조가 같음.");
		} else {	
			System.out.println("strVar1과 strVar2는 참조가 다름");
		}
		
		if(strVar1.equals(strVar2)) {
			System.out.println("strVar1과 strVar2는 문자열이 같음");
		}
		
		String strVar3 = new String("신민철");
		String strVar4 = new String("신민철");
		
		if(strVar3 == strVar4) {
			System.out.println("strVar3과 strVar4는 참조가 같음");
		}else {
			System.out.println("strVar3과 StrVar4는 참조가 다름");
		}
		if(strVar3.equals(strVar4)) {
			System.out.println("strVar3과 strVar4는 문자열이 같음");
		}
		
		if (strVar1 == strVar3) {
			System.out.println("starVar1과 strVar3는 참조가 같음");
		} else {
			System.out.println("strVar1과 strVar3는 참조가 다름");
		}
	}
	
	// 참조 타입의 변수들은 모두 null이란 걸 가진다.
	//String str = "";	//"abc -> empty
 	//System.out.println("총 문자수" + str.length());
	//기본 타입(primitive type)은 null을 가질 수 없다.
	//int intValue1 = null; //null은 블랙홀과 같은 것. 엠프티와도 다른. 즉""와도 다름.
	//주소도 없는 공허. ""는 주소는 가지고 있음. 즉 이를 널포인트 익셉션이라고 함.
 	/// null을 넣으면 null포인트 익센셥이 나서에러.
 }