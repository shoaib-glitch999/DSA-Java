package com.dsa.arrays.java;

public class ArrayAdd {

	public static void main(String[] args) {
		int[] arr1 = {12,14,16,19};
		int pos = 2;
		int value = 15;
		int[] arr2 = new int[arr1.length+1];
		
		for(int i=0; i<pos;i++) {
			arr2[i] = arr1[i];
		}
		arr2[pos]=value;
		for(int i=pos;i<arr1.length;i++) {
			arr2[i+1]=arr1[i];
		}

		for(int i=0; i<arr2.length;i++) {
			System.out.println(arr2[i]+" ");
		}
	}

}
