import java.util.Arrays;

public class LargestElementArray {
	public static void main(String[] args) {
		int arr[] = {1,42,55,6,8};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
	}
}
