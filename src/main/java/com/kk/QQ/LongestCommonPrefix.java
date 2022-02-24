package com.kk.QQ;

public class LongestCommonPrefix {

	public static void main(String[] args) {
		String[] str = {"fluwer", "fluw", "flurida"};

		System.out.println(findLongestCommonPrefix( str));
	}
	
	
	public static String findLongestCommonPrefix(String[] str) {
		
		if (str.length ==0) return "";
		
		String prefix = str[0];
		
		for (int i=1; i < str.length; i++) {
			while( str[i].indexOf(prefix) != 0)
				prefix = prefix.substring(0, prefix.length() -i);
		}
		return prefix;
	}

}
