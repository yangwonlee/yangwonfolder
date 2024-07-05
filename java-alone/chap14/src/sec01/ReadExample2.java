package sec01;

import java.io.*;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		/*Reader reader = new FileReader("./bin/sec01/test1.txt");

		while(true) {
			int data = reader.read();
			if (data == -1) break;
			System.out.println("1char data ->" + (char)data);
		}
		
		int data = reader.read(); //테스트 1.txt안의 1캐릭터 를 읽어 리턴.만약 못읽으면 -1 출력
		System.out.println("1char data -> " +(char) data);
		int data = reader.read(); //테스트 1.txt안의 1캐릭터 를 읽어 리턴.만약 못읽으면 -1 출력
		System.out.println("1char data -> " +(char) data);
		int data = reader.read(); //테스트 1.txt안의 1캐릭터 를 읽어 리턴.만약 못읽으면 -1 출력
		System.out.println("1char data -> " +(char) data);
		*/
		
		Reader reader = new FileReader("./bin/sec01/test1.txt");
		char[] bufferArray = new char[100];
		
		while(true) {
		int readCharNum = reader.read(bufferArray);
		if (readCharNum == -1) break;
		
		for(char buffer : bufferArray) {
			System.out.println("1char data -> " + (char) buffer);
		 }
		}
	}

}
