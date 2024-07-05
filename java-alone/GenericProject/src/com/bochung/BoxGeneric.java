package com.bochung;

// <T>는 제너릭(generic)
// T는 어떠한 타입도 올 수 있다. ex) int short Class etc...
public class BoxGeneric <T> {
	private T t;		//티는 위에 제너릭이기 때문에 문법상 오류가 나지 않음.
	
	public T get() {
		return this.t;
		
	}
	public void set(T t) {
		this.t = t;
		
	}
}	
		
		
		

