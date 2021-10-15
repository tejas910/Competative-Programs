package String;

import java.util.LinkedHashMap;
import java.util.*;

public class LongestSubstring {
	public static void main(String[] args) {
		String str = "abc";
		String str1 = null;
		int length = 0;
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		char[] arr = str.toCharArray();
		for(int i=0;i<arr.length;i++) {
			char ch = arr[i];
			if(!map.containsKey(ch)) {
				map.put(ch, i);
			}
			else {
				i = map.get(ch);
				map.clear();
			}
			if(map.size() > length) {
				length = map.size();
				str1 = map.keySet().toString();
			}
		}
		System.out.println(str1);
		
	}
}

