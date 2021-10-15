package Array;
import java.util.*;
public class VowelsandConso {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int count=0;
		for(int i=0;i<s.length()-2;i++) {
			char ch[] = s.toCharArray();
			if(isVowel(ch[i]) && !isVowel(ch[i+1])) {
				count++;
			}
			
		}
		System.out.println(count);
	}
	static boolean isVowel(char c) {
		if(c=='a'|| c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E'
				|| c=='I' || c=='O' || c=='U') {
			return true;
		}
		return false;
	}
}
