import java.util.*;
public class SumOfFirstAndLast {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int arr[] = new int[testcase];
		int temp[] = new int[testcase];
		int number;
		int Lastdigit;
		int firstdigit = 0;
		for(int i=0;i<testcase;i++) {
			arr[i] = sc.nextInt();
			temp[i] = arr[i];
		}

		for(int j=0;j<arr.length;j++) {
			number = temp[j];
			Lastdigit = number%10;
			int temp1 = arr[j];
			while(temp1>0) {
			   firstdigit = temp1%10;
			    temp1 /=10;
			    
		  }
			System.out.println(firstdigit + Lastdigit );
		}

	}
}
