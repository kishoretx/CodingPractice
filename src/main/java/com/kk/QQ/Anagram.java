package com.kk.QQ;

public class Anagram {

	public static void main(String[] args) {
		String a = "dabc";
		String b = "Abcd";
		
		System.out.println(isAnagram(a, b));
	}
	
	public static boolean isAnagram(String a, String b) {
		if (a.length() != b.length()) {
			return false;
		}		
		
		int[] charCount = new int[26];
		
		for (int i=0; i < a.length(); i++) {
			charCount[a.charAt(i) - 'a']++;
			charCount[b.charAt(i) - 'a']--;
		}
		

		for (int i: charCount) {
			if (i != 0)
				return false;
		}
		
		return true;
		
	}

}
