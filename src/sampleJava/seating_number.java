package sampleJava;

import java.util.Scanner;

public class seating_number {

	
	 public static void main(String[] args) {
		 
	        Scanner input=new Scanner(System.in);
	        int t=input.nextInt();
	        for(int i=0;i<t;i++){
	            int num=input.nextInt();
	            if(num<=108){
	                int s=num%12;
	                switch(s){
	                    case 1:System.out.println(num+11 + " " + "WS");break;
	                    case 2:System.out.println(num+9 +" " + "MS");break;
	                    case 3:System.out.println(num+7 +" "+ "AS");break;
	                    case 4:System.out.println(num+5 +" "+ "AS");break;
	                    case 5:System.out.println(num+3 +" "+ "MS");break;
	                    case 6:System.out.println(num+1 +" "+ "WS");break;
	                    case 7:System.out.println(num-1 +" "+ "WS");break;
	                    case 8:System.out.println(num-3 +" "+ "MS");break;
	                    case 9:System.out.println(num-5 + " "+ "AS");break;
	                    case 10:System.out.println(num-7 +" "+ "AS");break;
	                    case 11:System.out.println(num-9 +" "+ "MS");break;
	                    case 0:System.out.println(num-11 +" "+ "WS");break;
	 
	                }
	            }
	        } 		 
	 }
}
