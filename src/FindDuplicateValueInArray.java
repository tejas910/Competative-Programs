import java.util.*;
public class FindDuplicateValueInArray {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,4,4,4,5,6};
		int count = 0;
		int du=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[i+1]) {
				du = arr[i];
				count++;
			}
		}
		System.out.println(du);
	}
}
