package com.kk;

// Find 2 index of array element whose sum is 17
public class FindSumOf2NumsInArray {

	public static void main(String[] args) {
		int arr[] = {2, 4, 5, 7, 8 ,9 };
		int target = 17;
		
		for (int i=0; i < arr.length; i++) {
			int remain = target - arr[i] ;
			
			for (int j= i+1; j < arr.length; j++ ) {
				if (remain == arr[j]) {
					System.out.println(i + ", "+ j);
				}
			}
		}

	}

}
