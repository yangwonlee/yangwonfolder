package practice05;

import sec05.Singleton;

public class ShopService {
		private static ShopService ShopService = new ShopService();
		
		private ShopService() {} // private로 된 생성자는 외부에서 객체 생성 불가.
		
		static ShopService getInstance() {
			return ShopService;
		}
}
