package Array;
import java.util.*;
public class Divisible {
	 public static void main(String[] args) {
//		  Scanner sc = new Scanner(System.in);
//		  int n=sc.nextInt();
//		  int sum=0;
//		  for(int i=0;i<n*2;i=i+2){
//			  if(i%3==0){
//			  	sum=sum+i;
//			  }
//			}
//	 System.out.println(sum);
		 int[] a = {1,2,3,4,5};
		 int max=a[0];
		 for(int i=0;i<a.length;i++) {
			 if(max<a[i]) {
				 max = a[i];
			 }
		 }
		 System.out.println(max);
	 }
}
