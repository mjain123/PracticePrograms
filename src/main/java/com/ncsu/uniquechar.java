package com.ncsu;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class uniquechar {
	public static void main(String args[]) {
		Set<String> set1 = new HashSet<String>();
		System.out.println("Enter a word to check");
		Scanner s = new Scanner(System.in);
		String word = s.next();
		for (int i =0; i<word.length();i++)
		{
			if(!set1.add(word.charAt(i)+""))
			{
				System.out.println("Duplicate character present - "+word.charAt(i));
				return;
			}
			
		}
		System.out.println("No Duplicates present");
			// above approach can be modified for duplicate strings easily.
	}// another approach .. boolean 256
	public static boolean isUniqueChars2(String str) {
		boolean[] char_set = new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if (char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
}
