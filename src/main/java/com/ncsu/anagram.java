package com.ncsu;

public class anagram {

	public static void main(String[] args) {
		String s1="grehbadbt";
		String s2="gabbdreht";
		//if length are not equal return false;
		// one way is sort both string and compare. time complexity O(n2)
		int arr[]=new int[256];
		for(int i=0;i<s1.length();i++)
		{
			arr[s1.charAt(i)]++;
			arr[s2.charAt(i)]--;
		}
		for(int i=0;i<256;i++)
			if(arr[i]!=0)
			{	System.out.println("s1 and s2 are not an anagram");
				return;
			}
		
		System.out.println("s1 and s2 are anagram");
	}

}
