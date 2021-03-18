package io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class NameList {
	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("C:/Temp/Dir/nameList.txt");
		File file = new File("C:/Temp/Dir/nameList.txt");
		FileWriter fw = new FileWriter(file, true);
		Writer writer = new OutputStreamWriter(fos);
		InputStream is = System.in;
		byte[] data = new byte[100];
		String s = "";
		while(true) {
			int bytes = is.read(data);
			s = new String(data, 0, bytes-2);
			System.out.println(s);
			if(s.equals("end")) {
				break;
			}
			fw.write(s + "\n");
			fw.flush();
		}
		fw.close();
		System.out.println("파일에 저장되었습니다.");
		
	}
}
