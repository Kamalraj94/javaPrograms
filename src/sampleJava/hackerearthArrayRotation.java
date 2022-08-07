package sampleJava;

import java.util.Scanner;

public class hackerearthArrayRotation {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	
			int tc = s.nextInt();
			for (int i = 0; i < tc; i++) {
				int size = s.nextInt();
				int rotation = s.nextInt();
				int elements[] = new int[size];
				for (int j = 0; j < size; j++) {
					elements[j] = s.nextInt();
				}
				
			}
		
	}

}
