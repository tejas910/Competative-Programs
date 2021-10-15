import java.util.*;
public class ProductOfMinAndMax {
	public static void main(String[] args) {
		int arr[] = {5, 7, 9, 3, 6, 2};
		int arr1[] = {1, 2, 6, -1, 0, 9};
		
		Arrays.sort(arr);
		Arrays.sort(arr1);
		int max = arr[arr.length-1];
		int min = arr1[0];
		long pro = max * min;
		System.out.println(pro);
	}
}
