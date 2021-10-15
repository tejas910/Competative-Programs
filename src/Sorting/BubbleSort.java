package Sorting;
import java.util.*;
public class BubbleSort {
	public static void main(String[] args) {
		int arr[] = {23,5,2,14,9,1};
		System.out.print("Unsorted Array: ");
		for(int a:arr) {
			System.out.print(a+" ");
		}
		int n = arr.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-1;j++) {
				if(arr[j+1]<arr[j]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("Sorted Array: ");
		for(int a:arr) {
			System.out.print(a+" ");
		}
	}
}
