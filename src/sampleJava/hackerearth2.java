package sampleJava;

import java.math.BigInteger;
import java.util.Scanner;

public class hackerearth2 {

	public static void main(String[] args) 
    { 
		
		java.util.Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            System.out.println(a.add(b));
		}
		
		}	
}
