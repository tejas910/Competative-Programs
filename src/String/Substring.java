package String;
import java.util.*;
public class Substring {
	public static void main(String[] args) {
//		String str = "abc";
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}
}
