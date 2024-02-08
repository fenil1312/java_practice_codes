package ioprograms;

import java.io.*;

public class FileOutputStreamDemo {

	public static void main(String[] args) throws IOException {

		FileOutputStream fos = new FileOutputStream("file2.txt");
		BufferedOutputStream bos = new BufferedOutputStream(fos); // To increase the performance
		String s = "Hello, good afternoon..!";
		bos.write(s.getBytes());
		System.out.println("File created");
		bos.close();
		fos.close();
	}

}
