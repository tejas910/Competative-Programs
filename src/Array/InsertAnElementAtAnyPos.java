package Array;
import java.util.*;
public class InsertAnElementAtAnyPos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Element");
		int n = sc.nextInt();
		int arr[] = {1,2,3,4,5,6};
		arr =atEnd(arr, n);
		printArray(arr);
		
		
	}
	public static int[] atEnd(int[] a, int j) {
		int len = a.length;
		for(int i=0;i<len;i++) {
			if(i==len-1)
			{
				a[i] = j;
			}
		}
		return a;
	}
	
	public static void printArray(int a[]) {
		for(int i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	public static int[] atAnyPos(int a[], int ele , int pos) {
		
		return null;
	}
}
