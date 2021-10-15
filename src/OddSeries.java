import java.util.*;
public class OddSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long sum = 0;
		long last = (2*n)-1;
		for(int i=1;i<=last;i=i+2) {
			for(int j=1;j<=i;j=j+2) {
				sum = sum + j;
			}
		}
		System.out.println(sum);
	}
}
