package sampleJava;

import java.util.Scanner;

public class hackerearth6 {
	public static void main(String[] args) {			
	java.util.Scanner in = new Scanner(System.in);
	while(in.hasNext()) {
	String test = in.next();
	String test2 = "";
	char x;
	for(int i=0;i<test.length();i++) {
	char ch = test.charAt(i);
	boolean b = false;
	b = Character.isUpperCase(ch);
	if(b==true) {
		ch = Character.toLowerCase(ch);
		test2 = test2 + Character.toString(ch); 
	} else {
		ch = Character.toUpperCase(ch);
		test2 = test2 + Character.toString(ch); 
	}
	}
	System.out.println(test2);
	}
	}
}
