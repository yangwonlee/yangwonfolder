package sec1;

public class ResourcePathExample {

	public static void main(String[] args) {
		Class clazz = Car.class;
		
		String photo1Path = clazz.getResource("photo1.jpg").getPath();
		String photo2Path = clazz.getResource("images/photo2.jpg").getPath();
		//String photo3Path = clazz.getResource("photo3.jpg").getPath(); // 널포인트 예외발생
		
		System.out.println(photo1Path);
		System.out.println(photo2Path);
		//System.out.println(photo3path);
	}

}
