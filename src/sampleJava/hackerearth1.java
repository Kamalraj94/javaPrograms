package sampleJava;

import java.util.Scanner;

public class hackerearth1 {

	
	public static void main(String[] args) 
    { 
		String s ="i am indian";
        String[] test = s.split(" ");
        StringBuilder sb = null ;
        String u = "";                                    
        int k = test.length;
        for(int i=2;i>=0;i--)
        {
        	sb = new StringBuilder(test[i]);
        	if(i==0){
        		
                System.out.print(sb.reverse());
                u = u + sb;
                break;
            }
        	u = u + sb;
        System.out.print(sb.reverse() + " ");
        }	
       System.out.println("");
        System.out.println(u); 
}
}