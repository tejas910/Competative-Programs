import java.util.*;
public class KElementLargest {
	public static void main(String[] args) {
		int arr[] = {1,23,4,6,20};
		int n = 2;
		int arr1[] = new int[n];
		Arrays.sort(arr);
//		for(int i=arr.length-1;i>arr.length-1-n;i--) {
//			arr1[i] = arr[i];
//		}
		
		int arrsize = arr.length-1;
		for(int i=arrsize,j=0;i>arrsize-n;i--,j++) {
			arr1[j] = arr[i];
		}
		for(int a:arr1) {
			System.out.println(a);
		}
	}
}
