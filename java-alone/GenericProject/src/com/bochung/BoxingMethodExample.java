package com.bochung;

public class BoxingMethodExample {

	public static void main(String[] args) {
		//util<Integer> boxing의 <Integer>는 생략이 가능
		
		BoxGeneric<Integer> box1 = Util.<Integer>boxing(100);
		box1.get();
		
		BoxGeneric<String> box2 = Util.boxing("100");
		box2.get();
		
		//Util.compare("1","2"); //에러. 스트링, 즉 문자열이기 때문에. 숫자만 가능하다는 뜻.
		Util.compare(1, 2); //int -> Integer 자동으로 boxing으로 래퍼클래스로 바뀜.
		Util.compare(2, 1);
		Util.compare(2.1, 1); //double -> Double 자동으로 boxing
	
	}

}
