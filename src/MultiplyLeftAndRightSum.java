import java.util.*;
public class MultiplyLeftAndRightSum {
	public static void main(String[] args) {
		int arr[] = {1,2};
		int middle = arr.length/2;
		ArrayList<Integer> al = new ArrayList<>();
		int sum =0;
		if(middle%2==0) {
			for(int i=0;i<middle;i++) {
				sum = sum+arr[i];
			}
			al.add(sum);
			sum=0;
			for(int i=middle;i<arr.length;i++) {
				sum = sum+arr[i];
			}
			al.add(sum);
		}else {
			for(int i=0;i<middle;i++) {
				sum = sum+arr[i];
			}
			al.add(sum);
			sum=0;
			for(int i=middle;i<arr.length;i++) {
				sum = sum+arr[i];
			}
			al.add(sum);
		}
		sum=0;
		sum = al.get(0)*al.get(1);
		System.out.println(sum);
	}
}
