package com.bochung;

public class ProductExample { // 제너릭 타입. 메소드가 아니고.
	public static void main(String[] args) {
		Product<Tv, String> product1 = new Product<>();
		
		product1.setKind(new Tv());
		product1.setModel("SM-A401-65-APLUS");
		
		Tv tv1 = product1.getKind();
		String model1 = product1.getModel();
		//(tv)product~~ 이러지 않아도 제너릭으로 구현이 가능.
		
		Product<Car,String> product2 = new Product<>();
		product2.setKind(new Car());
		product2.setModel("GENESIS-HYUNDAI-4.0");
		
		Car car1 = product2.getKind();
		String model2 = product2.getModel();

	}
}
