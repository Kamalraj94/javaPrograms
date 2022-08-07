package sampleJava;

public class Highest_placement {

	public static void main(String[] args) 
    { 
		java.util.Scanner one = new java.util.Scanner(System.in);
		System.out.println("Enter the no of students placed in CS");
		int a = one.nextInt();
		System.out.println("Enter the no of students placed in ECE");
		int b = one.nextInt();
		System.out.println("Enter the no of students placed in MECH");
		int c = one.nextInt();
		if(a<0 || b<0 || c<0) {
			System.out.println("Input is Invalid");
		} else  if(a==0 && b==0 && c==0) {
		System.out.println("None of the department has got the highest placement");
         }else if(a>b && a>c) {
			System.out.println("Highest placement");
			System.out.println("CS");
		}else if(b>a && b>c) {
			System.out.println("Highest placement");
			System.out.println("ECE");
		}else if(c>a && c>b) {
			System.out.println("Highest placement");
			System.out.println("MECH");
		}else if(a==b) {
			System.out.println("Highest placement");
			System.out.println("CS");
			System.out.println("ECE");
		} else if(b==c) {
			System.out.println("Highest placement");
			System.out.println("ECE");
			System.out.println("MECH");
		} else if(a==c) {
			System.out.println("Highest placement");
			System.out.println("CS");
			System.out.println("MECH");
		}  
    }
}
