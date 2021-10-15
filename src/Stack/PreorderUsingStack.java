package Stack;

public class PreorderUsingStack {
	public static void main(String[] args) {
			int a[] = new int[256];
			int b[] = new int[256];
			String str = "catt";
			String str1 = "tatc";
			for(char f:str.toCharArray()) {
				int index = (int)f;
				a[index]++;
				
			}
			for(char d:str1.toCharArray()) {
				int index = (int)d;
				b[index]++;
				
			}
			boolean isAnagram = true;
			for(int i=0;i<256;i++) {
				if(a[i]!=b[i]) {
					isAnagram = false;
				}
			}
			if(isAnagram) {
				System.out.println("Anagram");
			}
			else {
				System.out.println("Not Anagram");
			}
	}
}
