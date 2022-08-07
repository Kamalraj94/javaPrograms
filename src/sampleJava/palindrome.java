package sampleJava;

public class palindrome {
	public static void main(String[] args)
	{
		int i;
		String reverse = "";
		String orginal = "madam";
		int size = orginal.length();
		
		 System.out.println(size);
		for(i=size-1;i>=0;i--)
			reverse = reverse + orginal.charAt(i);
			if(orginal.equals(reverse)) 
		    System.out.println(reverse);
			else
		    System.out.println("No palindrome");
	}
			
		}
	