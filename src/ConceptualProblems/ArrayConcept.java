package ConceptualProblems;
import java.util.*;
public class ArrayConcept {
	public static void main(String[] args) {
		int arr[] = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Entered array is:");
		for(int a:arr) {
			System.out.print(a+" ");
		}
	System.out.println(arr.hashCode());
	}
}
