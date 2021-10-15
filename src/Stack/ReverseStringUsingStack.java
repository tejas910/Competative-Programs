package Stack;
import java.util.*;
public class ReverseStringUsingStack {
	public static void main(String[] args) {
		String str = "Tejas Patil";
		char ch[] = str.toCharArray();
		
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<ch.length;i++) {
			stack.push(ch[i]);
		}
		for(int i=0;i<ch.length;i++) {
			ch[i] = stack.pop();
		}
		String str1 =  new String(ch);
		System.out.println(str1);
	}
}
