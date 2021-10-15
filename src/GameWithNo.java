import java.util.*;
public class GameWithNo {
	public static void main(String[] args) {
		int arr[] = {10,11,1,2,3};
		int arr1[] = new int[arr.length]; 
		ArrayList<Integer> al = new ArrayList<>();
		int c;
		for(int i=0;i<arr.length;i++) {
			if(i==arr.length-1) {
				al.add(arr[i]);
			}else {
			c = arr[i] ^ arr[i+1];
			al.add(c);}
		}
		for(int i=0;i<arr.length;i++) {
			arr1[i] = al.get(i);
			System.out.print(arr1[i]+" ");
		}
		
	}
}
