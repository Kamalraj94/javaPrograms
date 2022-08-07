package sampleJava;

public class dummymethod {
	
	public dummymethod(int a) {
		System.out.println(a);
	}
	
	public dummymethod(String a) {
		System.out.println(a);
	}
	
	
	
	
		public static void main(String[] args)
		{
			dummymethod n = new dummymethod(5);
			dummymethod o = new dummymethod("hello");
		}
	}
