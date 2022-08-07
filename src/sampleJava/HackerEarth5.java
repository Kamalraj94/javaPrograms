package sampleJava;

import java.util.Scanner;

public class HackerEarth5 {
	public static void main(String[] args) {			
		java.util.Scanner in = new Scanner(System.in);
		while(in.hasNext()) {	
	    String test = in.next();
	    if(test.length()<20) {
		char z = 'z';
		char o = 'o';
		int zword = 0;
		int oword = 0;
		for(int i = 0 ; i<test.length();i++) {
			if(test.charAt(i)==z) {
				zword++;
			}
			if(test.charAt(i)==o) {
				oword++;
			}			
		}
		if((zword*2)==oword) {
			System.out.println("Yes");
		}
	}
	}
	}
}
