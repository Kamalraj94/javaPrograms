package sampleJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class findProduct {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));  
		    String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> a = new ArrayList<>();

	        for (int i = 0; i < 3; i++) {
	            int aItem = Integer.parseInt(aTemp[i]);
	            a.add(aItem);
	        }

	        String[] bTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	        List<Integer> b = new ArrayList<>();

	        for (int i = 0; i < 3; i++) {
	            int bItem = Integer.parseInt(bTemp[i]);
	            b.add(bItem);
	        }
	        
	        int alice = 0;
	        int bob = 0;
	        for( int i = 0 ; i < a.size() ; i ++ ) {
	        	if(a.get(i) > b.get(i)) {
	        		alice = alice + 1 ;
	        	} else {
	        		bob = bob + 1;
	        	}
	        }
	        
	        List<Integer> result ;
	        System.out.println( alice +" "+ bob);
	}
}
