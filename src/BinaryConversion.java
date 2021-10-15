import java.util.*;
public class BinaryConversion {
	public static void main(String[] args) {
		int n = 42;
		ArrayList<Integer> al = new ArrayList<>();
		while(n>0) {
			int ele = n%2;
			al.add(ele);
			n = n/2;
		}
		for(int i=al.size()-1;i>0;i--) {
			System.out.print(al.get(i));
		}
	}
}
