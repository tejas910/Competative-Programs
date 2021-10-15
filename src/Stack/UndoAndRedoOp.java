package Stack;
import java.util.*;
public class UndoAndRedoOp {
	public static void main(String[] args) {
		Stack<Character> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		char ch[] = s.toCharArray();
		for(char c:ch) {
			st.push(c);
		}
		System.out.println("1. Undo Opreation");
		System.out.println("2. Redo Operation");
		System.out.println("3. Exit");
		System.out.println("Enter the choice: ");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			
			st.pop();
			
		}
	}
}
