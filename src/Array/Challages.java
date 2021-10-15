package Array;
import java.util.*;
public class Challages {
	public static void main(String[] args) {
//		for(String s:args) {
//			System.out.println(s+args[0]);
//		}
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a=0;
		int b=1;
		int c=0;
		for(int i=2;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
	}
	
}

