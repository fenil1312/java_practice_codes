package ioprograms;

import java.io.*;

public class DataOutputStreamDemo {

	public static void main(String[] args) throws IOException{

		FileOutputStream fis = new FileOutputStream("file3.txt");
		DataOutputStream dis = new DataOutputStream(fis);
		dis.writeInt(22);
		dis.writeUTF("Hello..👋"); // UTF - Unified Text Format (for string input)
		dis.writeDouble(3.14);
		System.out.println("File created");
		dis.close();
		fis.close();
	}

}
