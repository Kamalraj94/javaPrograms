package sampleJava;

import java.util.Scanner;

public class RoundOff {

	public static void main(String[] args) {

		java.util.Scanner number = new Scanner(System.in);
		int n = number.nextInt();
		int j = n % 10;
		if (j == 0) {
			System.out.println(n);
		} else if (j >= 5) {
			n = n + (10 - j);
			System.out.println(n);
		} else if (j < 5) {
			n = n - j;
			System.out.println(n);
		}
	}

}
