package com.kk.QQ;

public class Palindrome {

	public static void main(String[] args) {
		String str = "I am : cool, 2 looc ma i";
		
		System.out.println(isPalindrome(str));

	}
	
	
	public static boolean isPalindrome( String str) {
		
		String str2 = "";
		
		
		//remove special char from string
		for ( Character c: str.toCharArray()) {
			if (Character.isLetter(c) || Character.isDigit(c)) {
				str2 += c;
			}
		}
		
		System.out.println(str2);
		
		str2 = str2.toLowerCase();
		
		int count = str2.length();
		
		for ( int i=0; i < count/2; i++) {
			if (str2.charAt(i) != str2.charAt(count -1)) {
				return false;				
			}
			count--;
		}
		
		return true;
	}

}
