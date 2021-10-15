package Recursion;
//import java.util.*;
public class Factorial {
	public static void main(String[] args) {
		int result = fact(5);
		System.out.println(result);
		
	}
	public static int fact(int n) {
		// Base case for function 
		if(n==0) {
			return 1;
		}
		return n*fact(n-1);
		
	}
}

