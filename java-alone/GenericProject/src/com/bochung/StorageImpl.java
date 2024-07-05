package com.bochung;

public class StorageImpl<T> implements Storage<T> {
	private T[] array; //배열로 티를 만듦.

	//생성자
	public StorageImpl(int size) {
		this.array = (T[])new Object[size]; // 객체 배열 초기화
	}
	
	//메소드
	@Override
	public void add(T item, int index) {
		array[index] = item;
		
	}

	@Override
	public T get(int index) {
		return array[index];
	}

}
