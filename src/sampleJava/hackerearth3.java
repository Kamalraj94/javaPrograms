package sampleJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class hackerearth3 {

	public static void main(String[] args) 
    { 
		
    	Scanner s = new Scanner(System.in);
			int size = s.nextInt();
			int elements[] = new int[size];
			for (int j = 0; j < size; j++) {
				elements[j] = s.nextInt();
			}
	    int a = 0 ;
	    for(int i = 0 ; i < elements.length;i ++) {    	
	    	a = a + elements[i];
	    }
	    System.out.println(a);
		}
    }
	
