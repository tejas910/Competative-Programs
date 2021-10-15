import java.util.*;
public class DisplayLogestName {
	public static void main(String[] args) {
		String names[] = { "Geek", "Geeks", "Geeksfor",
				  "GeeksforGeek", "GeeksforGeeks" };
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0;i<names.length;i++) {
			al.add(names[i].length());
		}
		Collections.max(al);
	}
}
