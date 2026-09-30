package com.dsa.arrays.java;

public class MaxElementOfArray {

	public static void main(String[] args) {
		int arr[] = {21,43,76,32};
		int maxEle = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>maxEle) {
				maxEle=arr[i];
			}
		}
		System.out.println(maxEle);
	}

}
