package sampleJava;

import java.io.BufferedReader;
import static java.util.stream.Collectors.toList;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;


		public class hackerrank8 {
		    public static void main(String[] args) throws IOException {
		        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

		        List<Integer> grades = IntStream.range(0, gradesCount).mapToObj(i -> {
		            try {
		                return bufferedReader.readLine().replaceAll("\\s+$", "");
		            } catch (IOException ex) {
		                throw new RuntimeException(ex);
		            }
		        })
		            .map(String::trim)
		            .map(Integer::parseInt)
		            .collect(toList());

		        List<Integer> result = Result.gradingStudents(grades);

	}

}