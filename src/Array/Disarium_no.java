package Array;
import java.util.*;
public class Disarium_no {
	public static void main(String[] args) {
		int N = 89;
		int num = N;
		int a =0;
		int sum = 0;
		int i =1;
		ArrayList<Integer> al = new ArrayList<>();
		while(N>0) {
			a = N%10;
			al.add(a);
            N = N/10;
		}
		for(int k=al.size()-1; k>=0;k--) {
			sum = sum + (int) Math.pow(al.get(k), i);
			i++;
		}
		if(sum==num) {
			System.out.println("1");
		}
		else {
			System.out.println("0");
		}
	}
}
