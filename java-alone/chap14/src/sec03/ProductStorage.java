package sec03;

import java.util.*;

//상품을 관리하는 메인 클래스
public class ProductStorage {
	
	Scanner scanner = new Scanner(System.in);
	private int counter = 0;
	private List<Product> listProduct = new ArrayList<>();
	
	public void showMenu() {
		while(true) {		//3번을 누를 때 까지 계속 살아 있음
			//메뉴를 보여주는 메소드
			System.out.println("------------------------");
			System.out.println("1.등록 |  2.목록  |  3.종료");
			System.out.println("------------------------");
			System.out.println("선택: ");
			
			// 키보드를 입력받는 코드
			String selectNo = scanner.nextLine(); // 번호를 읽기
			switch(selectNo) {
			case "1":		//등록
				registerProduct();
				break;
			case "2":		//조회
				showProducts();
				break;
			case "3":		//종료
				return;
		}
		
		
		}		
	}
	// 상품 등록 실행
	public void registerProduct() {
		try {
		Product product = new Product();
		product.setPno(++counter); //상품 객체에 상품번호 저장
		
		System.out.print("상품명: ");  //줄바꿈은 하면 안되니까 ln 제거
		product.setName(scanner.nextLine()); //상품 객체에 상품 이름 저장
	
		System.out.print("가격: ");  
		product.setPrice(Integer.parseInt(scanner.nextLine()));
		
		
		System.out.print("재고: ");  
		product.setStock(Integer.parseInt(scanner.nextLine())); // 상품 객체에 상품 재고 저장
		
		listProduct.add(product);
		}catch(Exception e) {
			System.out.println("등록 에러: " + e.getMessage());
		}
	}
		
	// 상품리스트 조회 실행
		public void showProducts() {
			for(Product p : listProduct) {
				System.out.println(
						p.getPno() + "\t" +
						p.getName() + "\t" +
						p.getPrice() + "\t" +
						p.getStock()
					);
			}
		}
}