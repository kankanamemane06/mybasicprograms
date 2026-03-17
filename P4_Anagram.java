package Programming_Questions;

import java.util.Arrays;

public class P4_Anagram {

	public static void main(String[] args) {
		String s1="Listen";
		String s2="Silent";

		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		System.out.println("Original String S1="+s1);
		System.out.println("Original String S2="+s2);
		
		if(s1.length()==s2.length()) {
			System.out.println("String1 and String2 are eligible of becoming an anagram..But need to check");
		}
		else
		{
			System.out.println("String1 and String2 are not eligible of becoming an anagram.");
		}
		
		char[] a1=s1.toCharArray();
		char[] a2=s2.toCharArray();
		
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		
		Arrays.sort(a1);
		Arrays.sort(a2);
		System.out.println("String after Sorting");
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		
		if(Arrays.equals(a1, a2)) {
			System.out.println("String 1 and String 2 are Anagram");
		}
		else {
			System.out.println("String 1 and String 2 are  Not a Anagram");
		}
		
	}

}
