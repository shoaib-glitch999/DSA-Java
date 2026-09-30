package com.dsa.arrays.java;

public class MinEleArray {

	public static void main(String[] args) {
		int arr[] = {21,43,76,32};
		int minEle = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<minEle) {
				minEle=arr[i];
			}
		}
		System.out.println(minEle);

	}

}
