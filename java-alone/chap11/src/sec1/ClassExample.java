package sec1;

public class ClassExample {

	public static void main(String[] args) throws Exception {
	    // 첫번째 방법
		Class clazz1 =	String.class;
		// 두번째 방법
	    Class clazz2 = Class.forName("java.lang.String");
	    // 세번째 방법
	    String str1 = "aaa";
	    Class clazz3 = str1.getClass();
	    
	    System.out.println(clazz1.getName());
	    System.out.println(clazz1.getSimpleName());
	    System.out.println(clazz1.getPackage().getName());

	    //car 클래스 메타정보 가져오기
	    // how1
	    Class clazz = Car.class;
	    
	    //how2
	    //Class clazz = Class.forName("sec01.car");
	    
	    //how3
	    //Car car =  new Car();
	    //Class clazz = car.getClass();
	    
	    System.out.println(clazz.getName());
	    System.out.println(clazz.getSimpleName());
	    System.out.println(clazz.getPackage().getName()
	    		);
	
	
	}

}
