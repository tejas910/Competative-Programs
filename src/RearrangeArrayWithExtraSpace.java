import java.util.*;
public class RearrangeArrayWithExtraSpace {
	public static void main(String[] args) {
		long arr[] = {1,0};
		long arr1[] = new long[arr.length];
		for(long i=0;i<arr.length;i++) {
			arr1[(int) i] = arr[(int)i];
		}
		for(int i=0;i<arr1.length;i++) {
			arr[i] = arr1[(int)arr1[(int)i]];
		}
		for(long a:arr) {
			System.out.println(a);
		}
	}
}
