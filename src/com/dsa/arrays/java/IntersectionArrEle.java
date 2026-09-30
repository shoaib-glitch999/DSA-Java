package com.dsa.arrays.java;

public class IntersectionArrEle {

	public static void main(String[] args) {
		int[] arr1 = {1,2,2,4,6};
		int[] arr2 = {2,2,3,4};
		
		for(int i=0; i<arr1.length;i++) {
			boolean alreadyPrint = false;
			for(int k=0;k<i;k++) {
				if(arr1[k]==arr1[i]) {
					alreadyPrint = true;
					break;
				}
			}
			if(alreadyPrint) {
				continue;
			}
			for(int j=0;j<arr2.length;j++) {
				if(arr1[i]==arr2[j]) {
					System.out.println(arr1[i]);
					break;
				}
			}
		}
	}

}
