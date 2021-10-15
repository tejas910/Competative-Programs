package String;
import java.util.*;
public class LongestSubstringlength {
	public static void main(String[] args) {
		String str = "abc";
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				String s = str.substring(i, j);
				al.add(s.length());

			}
		}
		
		System.out.println(Collections.max(al));
	}
}
