package Array;
import java.util.*;
public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length-2;i++) {
			int pr = arr[i] * arr[i+1];
			al.add(pr);
		}
		Collections.sort(al);
		System.out.println(al);
	}
}
