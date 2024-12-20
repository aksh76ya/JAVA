package arrays;

import java.util.Scanner;

public class TestRevStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Accept a String");
		String str=new Scanner(System.in).next();
		String rstr="";
		char ch;
		for(int i=0; i < str.length(); i++) {
			ch=str.charAt(i);
			rstr=ch+rstr;
		}
		System.out.println("Reverse String is "+ rstr);
	}

}
