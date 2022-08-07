package sampleJava;

public class stringreverse {
	public static void main(String[] args)
	{
		String str = "i am indian";
		int i = str.length();
		String reverse = "";
		for(int j=i-1;j>=0;j--)
		reverse = reverse + str.charAt(j);
		System.out.println("string without reverse" + " " + str);
		System.out.println("string with reverse" + " " + reverse);
		String s2 = reverse.substring(0, 1).toUpperCase();
		String s3 = s2 + reverse.substring(1,reverse.length());
		System.out.println(s3);
		

       /* int num = 1245;
        int rev = 0;
        while(num!=0) {
        	rev = rev*10+num%10; //5
        	num = num/10;
        }
        System.out.println("reversing the integer" + rev);
        
        int num1 = 123456;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	*/
	
	
	}
}
