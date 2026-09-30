package com.dsa.searching;

public class UnsortedFindEleBinary {

	public static void main(String[] args) {
		// Binary Search requires sorted data.
		// This example demonstrates that Binary Search
		// does not work reliably on an unsorted array.
		int[] arr = {10,30,50,90,20,100};
		int target = 20;
		int l = 0;
		int r = arr.length-1;
		while(l<=r) {
			int mid = (l+r)/2;
			if(arr[mid]==target) {
				System.out.println("Element found at index " +mid+" -> "+ arr[mid]);
				return;
			}
			else if(arr[mid]<target) {
				l=mid+1;
			}
			else {
				r=mid-1;
			}
		}
		System.out.println("Element Not Found");
	}


}
