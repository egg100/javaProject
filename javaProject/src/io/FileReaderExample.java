package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileReaderExample {
	public static void main(String[] args) throws IOException {
		int data = 0;
		char[] readChars = new char[100];
		FileReader fr = new FileReader("C:\\Dev\\git\\javaProject\\javaProject\\src\\io\\FileExample.java");
		FileWriter fw = new FileWriter("C:/Temp/Dir/file1.txt");
		while((data = fr.read(readChars)) != -1) {
			String readLines = new String(readChars, 0, data);
//			System.out.print(new String(readChars));
			fw.write(readLines);
		}
		
		fw = new FileWriter("C:/Temp/Dir/emp.txt");
		fw.write("Hello World");
		
		fw.flush();
		fw.close();
		fr.close();
		
		System.out.println("end...");
	}
}
