package com.dsa.twopointers;

import java.util.Arrays;

public class ReverseArray {

	public static void revArr(int[] arr) {
		int left=0;
		int right = arr.length-1;
		while(left < right) {
			int temp = arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6};
		revArr(arr);
		System.out.println(Arrays.toString(arr));
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}

}
