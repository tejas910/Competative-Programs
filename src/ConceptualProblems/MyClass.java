package ConceptualProblems;

import java.util.*;
public class MyClass {
		private static void printCommonChars(String firstString, String secondString) 
		{
			char[] first = firstString.replaceAll("\\s+", "").toCharArray();
			char[] second = secondString.replaceAll("\\s+", "").toCharArray();
			Set<Character> firstStringSet = new TreeSet<>();
			Set<Character> secondStringSet = new TreeSet<>();
			for (char c : first) 
			{
				firstStringSet.add(c);
			}
			for (char c : second)
			{
				secondStringSet.add(c);
			}
			firstStringSet.retainAll(secondStringSet);
			String s = String.valueOf(firstStringSet);
			System.out.println(s);
			
		}
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			String firstString = sc.nextLine();
			String secondString = sc.nextLine();
			printCommonChars(firstString, secondString);	
			sc.close();
		}

}
