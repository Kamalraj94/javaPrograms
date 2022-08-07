package sampleJava;

public class string_reverse_diff {

	public static void main(String[] args)
	{
		
	String s = "i am indian";
	String[] test = s.split(" ");
	StringBuilder v;
	int k = test.length;
	String t = "";
	for(int i = k-1;i>=0;i--) {
        v = new StringBuilder(test[i]);
        t = t + v + " ";
		
	}
	System.out.println(t);
	}
	
}

