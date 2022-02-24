package com.kk;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Palindrome {		

		public static void main(String args[]) {


			String p = "AB";
			
			int h = p.length() ;
			boolean isPalindrome = true;
			
			for (int i=0; i < h; i++) {
				System.out.println(p.charAt(i) + "  " + p.charAt(h -i-1));
				if (p.charAt(i) != p.charAt(h -i -1)) {
					
					isPalindrome = false;
					break;
				} 
			}
		    
			System.out.println(p + " is not a Palindrome : " + isPalindrome);
		}		
	}