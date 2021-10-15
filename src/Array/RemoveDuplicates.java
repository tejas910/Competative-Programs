package Array;
import java.util.*;
public class RemoveDuplicates {
	public static void main(String[] args) {
		String s = "zvvo";
		Set<Character> set = new LinkedHashSet<>();
		char[] arr = s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		String str = String.valueOf(set);
		System.out.println(str.toString());
		
	}
}
