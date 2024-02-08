package ioprograms;

import java.io.*;

public class DataInputStreamDemo {

	public static void main(String[] args) throws IOException{

		FileInputStream fis = new FileInputStream("file3.txt");
		DataInputStream dis = new DataInputStream(fis);
		int n = dis.readInt();
		String s = dis.readUTF();
		double d = dis.readDouble();
		System.out.println(n + "\n" + s + "\n" + d);
		dis.close();
		fis.close();
	}

}
