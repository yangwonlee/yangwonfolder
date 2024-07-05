package sec06.exam05.package1;

public class B {
	public B() {
	A a = new A(); // 가능. 패키지 1안에 클래스 비랑 에이랑 같은 패키지라 임폴트가 필요가 없음.
	a.field1 = 1;
	a.field2 = 1;
//	a.field3 = 1; // 에러. 필드 3은 프라이빗으로 접근제한을 걸었기 때문. 클래스 A에서만 사용가능
	
	a.method1();
	a.method2();
	//a.method3(); //접근제한이 역시 프라이빗으로 걸려있기 때문에.
 }
}