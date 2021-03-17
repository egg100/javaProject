package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutExample {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("C:/Temp/Dir/dog.JPG");
		FileOutputStream fos = new FileOutputStream("C:/Temp/Dir/copyAry.JPG");
		int data = 0, cnt = 0;
		byte[] readBytes = new byte[100];
		while((data = fis.read(readBytes)) != -1) {
			fos.write(readBytes);
			cnt++;
		}
		fos.flush();
		fos.close();
		fis.close();
		
		System.out.println("end......" + cnt);
	}
}
