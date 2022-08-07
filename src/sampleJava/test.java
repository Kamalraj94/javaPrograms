package sampleJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

class test {
	
	public static int minimumDistances(List<Integer> a) {
		int n = 0 ;
	for ( int i = 0; i < a.size(); i ++ ) {
		for( int j = 1 ; j < a.size(); j ++ ) {
			int k = 0;
			if( a.get(i) == a.get(j)) {
				k ++ ;
			}
		}
	}
		return n;
    }
	private static final Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	            .map(Integer::parseInt)
	            .collect(toList());

	        int result = test.minimumDistances(a);
	    }
	}
