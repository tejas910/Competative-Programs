import java.util.Arrays;
import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int arr[] = new int[testcase];
//		int arr1[] = new int[testcase];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			int temp=arr[i];
			sum =0;
			while(temp>0) {
				  int lastdigit = temp%10;
				    temp /=10;
				    sum += lastdigit;
//				    if(temp==0) {
//				      System.out.println(lastdigit);
//				      break;
//				    }
			}
			System.out.println(sum);

		}
	
	} 
}
