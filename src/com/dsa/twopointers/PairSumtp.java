package com.dsa.twopointers;

public class PairSumtp {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 6, 9, 10 };
		int tar = 16;
		int l = 0, r = arr.length - 1;
		while (l < r) {
			int sum = arr[l] + arr[r];
			if (sum == tar) {
				System.out.println("Found Pairs ::" + arr[l] + " " + arr[r]);
				l++;
				r--;
			} else if (sum < tar) {
				l++;
			} else {
				r++;
			}
		}
	}
}
