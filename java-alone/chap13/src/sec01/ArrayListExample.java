package sec01;

import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// string으로 된 여러개의 객체를 어레이처럼 사용하도록 어레이리스트 객체를 생성
		List<String> list = new ArrayList<String>(); // 뒤에 어레이 리스트<>안에 클리스 이름은 생략이 가능
		// 무조건 뒤에는 스트링으로만 받겠다는 뜻. 스트링객체를 추가 및 저장

		// 리스트 원소 추가
		list.add("Java"); // 자바 값을 가진 스트링 객체를 0번째 인덱스에 추가 및 저장. 
		list.add("JDBC"); //제이디피씨 값을 가진 스트링 객체를 1번째 인덱스에 추가 및 저장
		list.add("servlet/JSP");// 이 값을 가진 string 객체를 2번째 인덱스에 추가및 저장
		list.add(2, "Database"); // 두번째 인덱스에 "Database값을 가진 스트링 객체를 저장. 
		//두번째 인덱스가 밀린 후 그 자리에 추가가 되서 데이터베이스값을 가진 스트링 객체가 저장이 됨.
		//즉 데이타베이스는 두번째 인덱스. 서블렛은 세번쨰 인덱스값이 됨.
		list.add("iBatis"); // 그렇다면 네번째 인덱스가 되겠지. 4번째 인덱스에 ibatis값을 가진 string 객체를 저장
		
		int size = list.size(); // 5: 저장된 총 객체의 수
		System.out.println("총 객체 수: " + size);
		System.out.println(); // 한 줄 띄우기
		
		
		// 리스트 원소 검색
		String skill = list.get(2); //2번 인덱스의 객체 얻기
		System.out.println("2: " + skill); // 2: database
		System.out.println(); //한줄 띄우기
		
		
		// 리스트의 개수만큼 순회하여 값을 찍음.
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		}
		
		System.out.println(); // 한 줄 띄우기
		
		// 리스트 원소 삭제
		
		list.remove(2); //인덱스 2번의 값을 삭제.-> database 삭제.
		// list는 다음과 같은 상태 -> 0: java, 1: jdbc 2: servlet/jsp, 3: ibatis
		list.remove(2);// 인덱스 2번의 값을 삭제. 서블랫 제이에스피 삭제.
		
		
		list.remove("iBatis"); // 값이 ibatis인것을 삭제.
		//list는 다음과 같은 상태 0:자바 1: 제이디비씨
		
		// 리스트의 개수만큼 순회하여 값을 찍음.
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);

		
		//리스트 원소 수정
		list.set(0, "Python");
		
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + ":" + str);
		
		
		list.clear();// 모조리 지워버리는 것
		
		}
		}		
	}


