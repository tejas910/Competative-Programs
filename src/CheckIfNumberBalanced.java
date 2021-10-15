import java.util.*;
public class CheckIfNumberBalanced {
	public static void main(String[] args) {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		ArrayList<Integer> al = new ArrayList<>();
		int brr[] = {3,6,9};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				sum = sum + arr[i][j];
				break;
			}
		}
		 Arrays.sort(brr);
		 int max = brr[brr.length-1];
		 al.add(sum);
		 al.add(max);
		 
	}
}
