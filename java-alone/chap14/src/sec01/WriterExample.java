package sec01;

import java.io.*;

public class WriterExample {
	public static void main(String[] args) throws Exception {
		//OutputStream os = new FileOutputStream("./bin/sec01/test1.db"); //객체를 만들기 위해 new.
		//현재 실행 위치(디드라이브의 자바얼론의 챕터14의 빈에 위치)의 이진 데이터 파일을 만듦.
		//OutputStream os = new FileOutputStream("./bin/sec01/test2.db");
		OutputStream os = new FileOutputStream("./bin/sec01/test3.db");
		
		
//		byte a = 10;
//		byte b = 20;
//		byte c = 30;
//		os.write(a); //1바이트(byte)씩 데이터를 출력
//		os.write(b);
//		os.write(c);
		
		
		byte[] array = {10, 20, 30, 40, 50 };
		os.write(array, 1, 3);	//1번 인덱스 값부터 3개 값을 버퍼에 출력. {20 30 40}이 기계어로.
		// 3바이트 차지
		os.flush(); //test1.db파일에 실제 남아있는 버퍼에 모든 바이트를 출력
		os.close(); //출력 스트림을 닫음. 안닫아도 되긴 하지만 닫는 습관을 들이자.
	
		System.out.println("프로그램 종료");
		
	}

}
