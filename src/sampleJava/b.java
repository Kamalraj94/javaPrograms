package sampleJava;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


class b {

    /*
     * Complete the 'doubleSize' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. LONG_INTEGER_ARRAY arr
     *  2. LONG_INTEGER b
     */
    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
                int size = s.nextInt();
                long myArray[] = new long [size];
                for(int i = 0; i<size; i++) {
                     myArray[i] = s.nextInt();
                 }
                Scanner y = new Scanner(System.in);
                int num = y.nextInt();

                long result = b.doubleSize(myArray, num);
                System.out.println(result);
        
}
 public static long doubleSize(long[] myArray, int num) {
    // Write your code here
     for(int i = 0;i<myArray.length;i++) {
                      if(myArray[i]==num) {
                          num = num*2;
                                  
                      } else {
                          num = num;
                      }      
                    }
                return num;
    }

}