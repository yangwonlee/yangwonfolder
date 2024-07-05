package sec01;

import java.io.*;

public class WriterExample2 {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("./bin/sec01/test1.txt");

		/*
		writer.write('A');
		writer.write(' ');
		writer.write('B');
		writer.write(' ');
		writer.write('c');
		
		*/
		char[] array = {'A', 'B', 'C'};
		writer.write(array);
				
		
		writer.flush();
		writer.close();
		
		System.out.println("프로그램 종료");

	}

}
