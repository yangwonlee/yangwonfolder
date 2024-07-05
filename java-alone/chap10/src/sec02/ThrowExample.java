package sec02;

public class ThrowExample {

	public static void findClass() 
			throws ClassNotFoundException, 
			NumberFormatException, 
			ArrayIndexOutOfBoundsException
	{ // 콤마로 여러개 가능.
		Class clazz = Class.forName("java.lang.String2");
	}
		
	public static void main(String[] args) {
	
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}catch(NumberFormatException e) {
			System.out.println("잘못된 문자가 들어가 있습니다.");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("설정된 배열의 크기를 넘은 값을 넣었습니다.");
		} finally {
			System.out.println("프로그램이 종료되었습니다.");
		}

	}

}
