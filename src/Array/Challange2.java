package Array;
import java.util.*;
public class Challange2 {
	public static void main(String[] args) {
		ArrayList<Integer> multiple = new ArrayList<>();
		ArrayList<Integer> nonmultiple = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> inputarray = new ArrayList<>();
		int N = sc.nextInt();
		for(int i=0;i<N;i++) {
			inputarray.add(sc.nextInt());
		}
		for(int i=0;i<inputarray.size();i++) {
			if(inputarray.get(i)%10==0) {
				multiple.add(inputarray.get(i));
			}
			else {
				nonmultiple.add(inputarray.get(i));
			}

		}
		nonmultiple.addAll(multiple);
		for(int data:nonmultiple) {
			System.out.println(nonmultiple.get(data));
		}
		
	}
}
