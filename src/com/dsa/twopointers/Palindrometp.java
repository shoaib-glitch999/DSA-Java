package com.dsa.twopointers;

public class Palindrometp {

	public static void main(String[] args) {
		String s = "level";
		int left=0,right=s.length()-1;
		while(left < right) {
			if(s.charAt(left)!=s.charAt(right)) {
				System.out.println(s + " is Not a palindrome");
				return;
			}
			left++;
			right--;
		}
		System.out.println(s + " is a Palindrome");
	}

}
