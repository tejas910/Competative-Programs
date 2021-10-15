import java.util.*;
public class CyclicallyRotateArrayByOne {
	public static void main(String[] args) {
		long arr[] = {1,2,3,4,5};
		long arr1[] = new long[arr.length];
		long key = 5;
		 for(int i = 0; i < key; i++){    
	            int j, last;    
	            //Stores the last element of array    
	            last =(int) arr[arr.length-1];    
	            
	            for(j = arr.length-1; j > 0; j--){    
	                //Shift element of array by one    
	                arr[j] = arr[j-1];    
	            }    
	            //Last element of array will be added to the start of array.    
	            arr[0] = last;    
	        }    
		 for(long a:arr) {
			 System.out.println(a);
		 }
	}
}	
