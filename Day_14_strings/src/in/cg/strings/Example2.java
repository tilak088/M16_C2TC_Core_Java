package in.cg.strings;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		String str1=new String(s.nextLine());
		String str2=new String(s.nextLine());
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
	}

}