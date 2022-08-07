package sampleJava;

import java.util.ArrayList;
import java.util.List;

public class Result {

	 public static List<Integer> gradingStudents(List<Integer> grades) {
		
		 List<Integer> fin = new ArrayList();
		 for ( int i = 0; i < grades.size() ; i++ ) {
			 if ( grades.get(i) < 40 ) {
				 fin.add(grades.get(i));
			 }
			 
			 
		 }	 
		 
		 
		 
		 return grades;
		    }
}