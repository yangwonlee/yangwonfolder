package sec01;

import java.io.*;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		//InputStream is = new FileInputStream("./bin/sec01/test1.db");

		/*
		while(true) {
			int data = is.read();
			if(data == -1) {
				break;
			}
			System.out.println("1byte data ->" + data);
		}
		*/
		/*
		int data1 = is.read(); //test1.db안의 1바이트 읽어 리턴
			System.out.println("1byte ->" + data1); //10
			int data2 = is.read(); //test1.db안의 1바이트 읽어 리턴. 만약 못읽으면 -1을 리턴.
			System.out.println("1byte ->" + data2); //20
			*/
		InputStream is = new FileInputStream("./bin/sec01/test2.db");
		byte[] buffer = new byte[3]; //test10 20 30을 담을 수 있는 공간을 마련.
		
			int readByteNum = is.read(buffer); //buffer 크기만큼 test2.db에 있는 데이터를 가져온다

			for(byte b1 : buffer) {
				System.out.println(b1);
			
	}
	
			is.close(); // 읽을땐 플러시는 필요 없음.
		}
	}


