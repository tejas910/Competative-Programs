package Array;

import java.util.*;
public class Practice {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	int data = sc.nextInt();
	int digit = sc.nextInt();
	
	int result = funcount(data,digit);
	System.out.println(result);

	}
	
	static int funcount(int data,int digit) {
		int count=0;
		while(data>0) {
			if(data%10==digit) {
				count = count+1;
			}
			data=data/10;

		}
		return count;
	}
}
