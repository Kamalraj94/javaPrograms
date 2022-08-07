package sampleJava;

import java.util.Scanner;

public class hackerearth4 {

	//factorial
	public static void main(String[] args) 
    { 
	java.util.Scanner in = new Scanner(System.in);
	int b = 1;
	while(in.hasNext()) {
	 int a = in.nextInt();
	 for(int i = 1;i<=a;i++) {
		 b = b*i;
	 }
			System.out.println(b);
	}
	}
}
