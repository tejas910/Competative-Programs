import java.util.*;
public class SumOfNumersinString {
	public static void main(String[] args) {
		String str = "1tejas24";
		
		int sum = 0;
		char ch[] = new char[str.length()];
		for(char ch1: str.toCharArray()) {
			if(Character.isDigit(ch1)) {
				System.out.println(ch1);
			}
		}
		System.out.println(sum);
	}
}

