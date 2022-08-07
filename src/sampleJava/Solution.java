package sampleJava;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class Solution extends b {

    public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);       
        int testCases = Integer.parseInt(scan.nextLine());
        for(int k = 0 ; k < testCases; k++) {
            int condition = Integer.parseInt(scan.nextLine());
            switch(condition){
                case 1:
                    String s1=scan.nextLine().trim();
                    String s2=scan.nextLine().trim();
                    if(s1.equals(s2)) {
                    	System.out.println("Same");
                    } else {
                    	System.out.println("Different");
                    }
                    break;
                case 2:
                    int num1 = scan.nextInt();
                    int num2 = scan.nextInt();
                    
                    if(num1 == num2) {
                    	System.out.println("Same");
                    } else {
                    	System.out.println("Different");
                    }
                    if(scan.hasNext()){ // avoid exception if this last test case
                        scan.nextLine(); // eat space until next line
                    }
                    break;
                case 3:
                    // create and fill arrays
                    int[] array1 = new int[scan.nextInt()];
                    int[] array2 = new int[scan.nextInt()];
                    for(int i = 0; i < array1.length; i++){
                        array1[i] = scan.nextInt();
                    }
                    for(int i = 0; i < array2.length; i++){
                        array2[i] = scan.nextInt();
                    }
                    

                    if(array1.equals(array2)) {
                    	System.out.println("Same");
                    } else {
                    	System.out.println("Different");
                    }
                    if(scan.hasNext()){ // avoid exception if this last test case
                        scan.nextLine(); // eat space until next line
                    }
          
                default:
                    System.err.println("Invalid input.");
            }// end switch
        }// end while
        scan.close();
    }
}