package sampleJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyCalculator {

	static long power(int n, int p) {
		int a = n;
		for(int i = 0; i <= n ; i ++ ) {
			a = a* n;
		}
	
		return a;
	}
}

public class hakcerrank {
		
			 public static final MyCalculator my_calculator = new MyCalculator();
			    public static final Scanner in = new Scanner(System.in);
			    
			    public static void main(String[] args) throws Exception {
			        while (in .hasNextInt()) {
			            int n = in .nextInt();
			            int p = in .nextInt();
			            if ( n < 0 || p < 0 ) {
			            	throw new Exception(" n or p should not be negative.");
			            }
			            if ( n == 0 || p == 0 ) {
			            	throw new Exception(" n and p should not be zero.");
			            } else {
			          
			                System.out.println(my_calculator.power(n, p));
			            }
			            
			        }
			    }
	  }
	

