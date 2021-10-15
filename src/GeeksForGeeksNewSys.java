import java.util.*;
public class GeeksForGeeksNewSys {
	public static void main(String[] args) {
		ArrayList<String> li = new ArrayList<>();
		String arr[] = {"abc","abc","aab","aab","abc"};
		int k = 1;
		for(int i=0;i<arr.length;i++) {
			if(!li.contains(arr[i])) {
				li.add(arr[i]);
			}
			else {
				li.add(arr[i]+k++);
			}
		}
		System.out.println(li);
	}
}
