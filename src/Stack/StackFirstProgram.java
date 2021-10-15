package Stack;
import java.util.*;
public class StackFirstProgram {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<>();
		for(int i=0;i<10;i++) {
			st.push(i);
		}
		for(int i=0;i<10;i++) {
			int element = st.pop();
			System.out.println("Pop out element is "+element);
		}
	
	}
}
