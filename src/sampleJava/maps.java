package sampleJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class maps {
	public static void main(String[] args) 
    { 
		HashMap<Integer, String> t = new HashMap();
       
         t.put(1, "one");
         t.put(2, "two");
         
         Iterator<Map.Entry<Integer, String>> it = t.entrySet().iterator();
         while(it.hasNext()) {
        	 Map.Entry<Integer, String> entry = it.next(); 
             System.out.println("Key = " + entry.getKey() +  
                                 ", Value = " + entry.getValue()); 
         }
		
    }
}
