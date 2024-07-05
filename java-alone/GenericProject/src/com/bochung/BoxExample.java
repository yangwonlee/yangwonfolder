package com.bochung;

public class BoxExample {
	public static void main(String[] args) {
		Box box = new Box();
	
		// 단점1: 캐스팅하는 과정중에 너무 성능을 깎아버림. 
		box.setObject("hello"); //String 타입을 Object타입으로, 즉 부모로 자동타입변환(promotion)
		String str1 = (String) box.getObject(); //Object 타입을 string타입으로 강제타입 변환. 우리가 늘 했던 방식
		//----------------------------------------------------------------------
		
		// BoxGeneric box2 = new BoxGeneric(); 이러면 제네릭 활용을 못하는 것
		// 위의 단점을 개선하는 것이 generic 기능. 캐스팅을 하지 않아도 깔끔하게 정리가 가능.
		// int short등 타입에 구애되지 않음.
		BoxGeneric<String> box2 = new BoxGeneric<>();
		box2.set("hello");
		String str2 = box2.get();
		
		BoxGeneric<Integer> box3 = new BoxGeneric<>();
		box3.set(1);
		Integer int1 = box3.get();
	
		BoxGeneric<String> box5 = new BoxGeneric<>();
		box5.set(new box());
		String str5 = box5.get();
		
		BoxGeneric<Integer> box3 = new BoxGeneric<>();
		box3.set(1);
		Integer int1 = box3.get();
	}

}
	}

}
	
	}

}
