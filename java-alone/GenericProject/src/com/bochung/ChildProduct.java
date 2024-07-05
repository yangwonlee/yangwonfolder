package com.bochung;

//제너릭 타임을 상속받는 예제
public class ChildProduct<T, M, C> extends Product<T, M> { 
// 프로덕트 t,m을 상속받는 다는 뜻. 전술한 두개의 티, 엠은 동일.

	private C company;

	public C getCompany() {
		return company;
	}

	public void setCompany(C company) {
		this.company = company;
	}
	
}
