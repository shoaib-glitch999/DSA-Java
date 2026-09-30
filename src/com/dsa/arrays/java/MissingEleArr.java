package com.dsa.arrays.java;

public class MissingEleArr {

	public static void main(String[] args) {
		int arr[] = {1,3,4,5};
		int n = arr.length+1;
		int oriSum = n*(n+1)/2;
		int arrSum=0;
		for(int i=0;i<arr.length;i++) {
			arrSum+=arr[i];
		}
		int missNum = oriSum - arrSum; 
		System.out.println(missNum);

	}

}
