package SearchingAlgorithm;
import java.util.*;
public class LinearSearch {
	public static void main(String[] args) {
		int arr[] = {32,54,6,71,9,87};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Key to search");
		int keyToSearch = sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==keyToSearch) {
				System.out.println(keyToSearch+" is found at index "+i);
				break;
			}
			
		}
	}
}
