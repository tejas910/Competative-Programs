package Array;
import java.util.*;
public class forloopchallange {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = sc.nextInt();
		ArrayList<Double> al = new ArrayList<>();
		for(int i=0;i<n;i++) {
			double ans = 0;
			for(int j=0;j<=i;j++) {
				ans = (Math.pow(2, i) * b)+a;
			}
			al.add(ans);
		}
		for(Double al1:al){
			System.out.println(al1);
		}
	}
}
