package sampleJava;

import java.util.Scanner;
import java.util.Stack;

public class TestThread {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String s = in.next();
    int t = s.length();
    tests:
    for(int a0 = 0; a0 < t; a0++){
       // String s = in.next();
        Stack<Character> stack = new Stack<>();
        
        for(char c : s.toCharArray())
        {
            if(c == '(')
                stack.push(')');
            else if(c == '{')
                stack.push('}');
            else if(c == '[')
                stack.push(']');
            
            else{
                if( stack.isEmpty() || c != stack.peek()){
                    System.out.println("NO");
                    continue tests;    
                }
                else{
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
}

