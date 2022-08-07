package sampleJava;

import java.util.Scanner;

public class hackerearth7 {
	public static void main(String[] args) {
		java.util.Scanner in = new Scanner(System.in);
		while (in.hasNext()) {
			int n = in.nextInt();
			int j;
			for (int i = 1; i < 11; i++) {
				j = n * i;
				System.out.println(j);
			}
		}
}
}
