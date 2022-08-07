package sampleJava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class starpattern {
	public static void main(String[] args)
	{
		 int i,j,k;
		 
		 for (i=0;i<10;i++) {
			 for(j=10-i;j>1;j--)
			 {
				 System.out.print(" ");
			 }
			 
			 for(k=0;k<=i;k++) 
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
	}
}