package Recursion;

public class SumOfNElements {
	public static void main(String[] args) {
		int result = sumOfElements(10);
		System.out.println(result);
	}
	public static int sumOfElements(int n) {
		if(n==1) {
			return 1;
		}
		return n + sumOfElements(n-1);
		
	}
}
