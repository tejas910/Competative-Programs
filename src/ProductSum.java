import java.util.*;
public class ProductSum {
	public static void main(String[] args) {
		long a=-24, b=33;
		a = Math.abs(a);
		b = Math.abs(b);
		System.out.println(a*b);
		String ans  = String.valueOf(a*b);
		char ar[] = ans.toCharArray();
		long fin = ar.length;
		System.out.println(fin);
	
	}
}
