import java.util.*;
public class PlayWithOr {
	public static void main(String[] args) {
		int arr[] = {10,11,1,2,3};
		int arr1[] = new int[arr.length];
		int c;
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				al.add(arr[i]);
			}
			else {
				c = arr[i] | arr[i+1];
				al.add(c);
			}
			
		}
		for(int i=0;i<arr1.length;i++) {
			arr1[i] = al.get(i);
			System.out.print(arr1[i]+" ");
		}
	}
}
