package ioprograms;

import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("file5.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		String s = "Hello programers..";
		bw.write(s);
		System.out.println("File created successfully");
		bw.close();
		fw.close();
	}

}
