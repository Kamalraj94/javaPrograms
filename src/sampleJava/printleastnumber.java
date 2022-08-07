package sampleJava;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class printleastnumber {

	
	public static void main(String[] args) 
    { 
		 
		java.util.Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b = "";
		int i;
		for( i=1 ;i<a.length();i++) {
			 Character ch = a.charAt(i);
			 if(Character.isUpperCase(ch)) {
				 b = b + "_" + Character.toLowerCase(ch);
			 } else {
				 b += ch;
			 }		
		}
	System.out.println(b);	
	char c[] = b.toCharArray();
	c[0]  = Character.toLowerCase(c[0]);
	String last = new String(c);
	System.out.println(last);
	
}
    }
    