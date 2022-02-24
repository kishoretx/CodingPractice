package com.kk;

public class IfLogic {

	public static void main(String[] args) {


		int n = 24;
		System.out.println(checkWeird( n));
		
	}

	public static String checkWeird(int n) {
		
		if ( n % 2 != 0)
			return "Weird";
		else if (n%2 == 0 && n >=2 && n <= 5)
			return "Not Weird";
		else if (n%2 == 0 && n >=6 && n <= 20)
			return "Weird";
		else if (n%2 == 0 && n > 20)
			return "Not Weird";
		
		
		return "n/a";
	}
}
