package practice;

import java.io.*;

public class BufferReaderInput {

	public static void main(String[] args) throws Exception {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("enter name: ");
		String name = br.readLine();
		System.out.println(name);
		
		System.out.println("enter num: ");
		int num = Integer.parseInt(br.readLine());
		System.out.println(num);

	}

}
