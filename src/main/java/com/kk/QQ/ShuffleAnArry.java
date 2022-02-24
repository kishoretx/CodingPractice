package com.kk.QQ;

public class ShuffleAnArry {

	public static void main(String[] args) {
		int[] arr = { 2,5,1,3,4,7 };
		int pos = 3;
		int temp = 0;
		
		for ( int i=0; i < arr.length/2; i++) {
			temp = arr[i+1];
			arr[i+1] = arr[i+3];
			arr[i+2] = temp;
			i += 3;
			
		}
		
		for (int i : arr) {
			System.out.print(i + " ");
		}

	}

}
