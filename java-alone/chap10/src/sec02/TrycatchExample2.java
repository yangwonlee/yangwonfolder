package sec02;

public class TrycatchExample2 {

	public static void main(String[] args) {
		try {
			System.out.println("잘 나오나");
		} catch(Exception e) {
			System.out.println("exception 발생");
		} finally {
			System.out.println("finally 실행됨");
		}
		System.out.println("프로그램 종료"); // 이 라인은 실행되지 않음. try블록에서 리턴을 만나면 
		//파이널리만 무조건 예외적으로 실행되는거라 밑의 라인인 이것은 실행되지 않음.
	}	

}
// 끝난다는 의미인 보이드 리턴을 만나더라도 트라이문 안은 무조건 실행됨. 메소드는 안되지만.