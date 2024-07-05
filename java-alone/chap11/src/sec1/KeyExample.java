package sec1;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// 키 객체를 식별 키로 사용해서 스트링 값을 저장하는 해쉬맵 객체를 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		// 식별키 key1을 "홍길동"으로 저장
		hashMap.put(new Key(1), "홍길동");
		
		String value = hashMap.get(new Key(1)); //key1의 값을 가져온다
		System.out.println(value); //number 값을 가져오도록 해시코드 메소드를 재정의하였다면
		//"홍길동"을 가져온다
		
	}

}
