package sampleJava;

import java.util.Scanner;

public class SDET {

	public static void main(String[] args) { 
	    
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int myArray[] = new int [size];
		for(int i = 0; i<size; i++) {
	         myArray[i] = s.nextInt();
	     }
		Scanner y = new Scanner(System.in);
		int num = y.nextInt();
		for(int i = 0;i<myArray.length;i++) {
		  if(myArray[i]==num) {
			  num = num*2;
		  			
		  } else {
			  num = num;
		  }	  
		}
		System.out.println(num);
	}
}
