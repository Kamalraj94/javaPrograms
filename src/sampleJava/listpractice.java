package sampleJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class listpractice {
	 public static void main(String[] args) 
	    { 
		 List<String> List = new LinkedList<String>();
		 List.add("lama");
		 List.add("2");
		 List.add("3");
		 System.out.println(List);
		 
		 Iterator<String> Iteratorlist = List.iterator();
		 while(Iteratorlist.hasNext())
		 {
			 System.out.println(Iteratorlist.next());
		 }
		 
	    }

}

