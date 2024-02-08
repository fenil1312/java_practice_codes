package ioprograms;

import java.io.*;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("F:/Eclipse/MyProject/src/ioprograms/FileReaderDemo.java");
		BufferedReader br = new BufferedReader(fr);
		int n;
		while ((n = br.read()) != -1) { // -1 indicates end of the file
			System.out.print((char) n);
		}
		br.close();
		fr.close();
	}

}
