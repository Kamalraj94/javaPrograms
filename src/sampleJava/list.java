package sampleJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class list {
	
	public static void main(String[] args)
	{
		    List<String> myList = new ArrayList<String>();
		    myList.add("A");
	        myList.add("B");
	        myList.add("C");
	        myList.add("D");
	        Iterator<String> it = myList.iterator();
	        while (it.hasNext()) {	 
	            System.out.println(it.next());
	        }
	        
}
}