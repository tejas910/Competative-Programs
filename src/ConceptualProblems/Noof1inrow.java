package ConceptualProblems;

import java.util.ArrayList;
import java.util.Collections;

public class Noof1inrow {
	public static void main(String[] args)
	{
		int arr[][] ={{0, 1, 1, 1},
		             {0, 0, 1, 1},
		             {1, 1, 1, 1},
		             {0, 0, 0, 0}};
		int count=0;
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i][j]==1) {
					count++;
					
					
				}
				if(j==3) {
					al.add(count);
					count=0;
				}
			}
		}
		

		for(int i=0;i<al.size();i++) {
			if(al.get(i)==Collections.max(al)) {
				System.out.println(i);
			}
		}
	}
}
