package com.bochung;

public class Box {
	private Object object; // 최상위 클래스. 뭐든 캐스팅이 가능.

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

	//우클릭에 소스. 소스에서 제네레이터 게터스앤드 세터스를 클릭하고 오브젝트에 좌클릭을 하면 즉시생성.

}
