package com.dsa.searching;

public class FindFirstEvenNumLinear {

	public static void main(String[] args) {
		int[] arr = {1,5,3,2,8,40,99};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2 == 0) {
				System.out.println("Found Even number : " + arr[i]);
				return;
			}
		}
		System.out.println("Not Found");
	}

}
