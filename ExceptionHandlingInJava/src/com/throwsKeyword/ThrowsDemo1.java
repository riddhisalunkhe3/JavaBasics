package com.throwsKeyword;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsDemo1 {
	public static void main(String[] args) {
		System.out.println("main starts");
		ThrowsDemo1 t1 = new ThrowsDemo1();
		try {
			t1.k1();	
		}catch(IOException ex)
		{
			System.out.println(ex);
		}
		System.out.println("main method ends");
	}
	public void k1() throws IOException
	{
		System.out.println("Monday");
		k2();
	}
	public void k2() throws IOException 
	{
		System.out.println("Tuesday");
		k3();
	}
	public void k3() throws FileNotFoundException
	{
		System.out.println("Wednesday");
		FileReader r = new FileReader("Riddhi.txt");
	}
}
