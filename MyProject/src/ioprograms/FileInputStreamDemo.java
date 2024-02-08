package ioprograms;

import java.io.*;

public class FileInputStreamDemo {

	public static void main(String[] args) throws IOException {

		FileInputStream fis = new FileInputStream("file2.txt");
		BufferedInputStream bis = new BufferedInputStream(fis);
		int size = fis.available();
		byte[] read = new byte[size];
		bis.read(read);
		String text = new String(read);
		System.out.println(text);
		bis.close();
		fis.close();
	}

}
