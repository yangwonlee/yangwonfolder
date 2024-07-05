package com.bochung;

//generic 메소드 사용 예제
public class Util {
	public static <T> BoxGeneric <T> boxing(T t){  //리턴 타입이 박스제너릭인 값을 받음
	BoxGeneric<T> boxGeneric = new BoxGeneric<T>();
	boxGeneric.set(t);
	
	return boxGeneric; 
 }
	// T로 될 수 있는 타입은 숫자로 된 타입으로 제한
	public static <T extends Number> int compare(T t1, T t2) { //상속이 아닌 제네릭을 제한. 클래스 옆에서 쓰면 상속. 제네릭을 쓰면 제한을 하는 기능.
	double v1 = t1.doubleValue();
	double v2 = t2.doubleValue();
	
	return Double.compare(v1, v2);
	
	}
}
