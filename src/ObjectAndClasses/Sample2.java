package ObjectAndClasses;
import java.util.*;
public class Sample2 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int L,R,X,Y;
//		L = sc.nextInt();
//		R = sc.nextInt();
//		X = sc.nextInt();
//		Y = sc.nextInt();
//		int count=0;
//		for(int i=L;i<R;i++) {
//			if(i%X!=0 && i%Y!=0) {
//				count++;
//			}
//		}
//		System.out.println(count);
		int arr[] = {1,2,3,4,5};
		int n = arr.length;
		int temp = arr[n-1];
        for(int i=n-1;i>0;i--){
                arr[i] = arr[i-1];
        }
        arr[0] = temp;
        for(int i=0;i>n;i++) {
        	System.out.println(arr[i]);
        }	
	}
}
