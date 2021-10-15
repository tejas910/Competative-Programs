import java.util.*;
public class RedOrGreen {
	public static void main(String[] args) {
		String str = "RGRGR";
		int count = 0;
		int count1 = 0;
		char ch[] = new char[str.length()];
		for(int i=0;i<str.length();i++) {
			ch[i] = str.charAt(i);
			if(ch[i]=='R') {
				count++;
			}
			else {
				count1++;
			}
			
		}
		if(count < count1) {
			System.out.println(count);
		}
		else {
			System.out.println(count1);
		}
	}
}
