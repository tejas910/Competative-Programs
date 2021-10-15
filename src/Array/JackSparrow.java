package Array;
import java.util.*;

public class JackSparrow {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s =  sc.nextLine();
		char[] arr = s.toCharArray();
		char[] arr1 = new char[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]=='v') {
				arr1[i]= 'a';
			}
			else if(arr[i]=='w') {
				arr1[i]= 'b';
			}
			else if(arr[i]=='x') {
				arr1[i]= 'c';
			}
			else if(arr[i]=='y') {
				arr1[i]= 'd';
			}
			else if(arr[i]=='z') {
				arr1[i]= 'e';
			}
			else {
				arr1[i] = (char) (arr[i] + 5); 
			}	
		}
		String s1 = String.valueOf(arr1);
		System.out.println(s1);
	}

}
