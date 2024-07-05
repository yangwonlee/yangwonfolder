package sec02;

public class Example {

	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl; // 인터페이스 에이로 자동 형변환
		ia.methodA(); // 임플리멘테이션씨의 메소드 에이를 실행
		System.out.println(); //한줄 띄우기

		InterfaceB ib = impl;
		ib.methodB();
		System.out.println(); //한줄 띄우기
		
		InterfaceC ic = impl; //인터페이스씨로 자동형변환
		ic.methodA();	//임플리멘테이션씨의 메소드 에이를 실행
		ic.methodB();	//임플리멘테이션 씨의 메소드 비를
		ic.methodC();	// //메소드 씨를 실행
	}

}
