package com.dsa.searching;

public class FindStringLinear {

	public static void main(String[] args) {
		String[] names = {"bahu","bali","sena","deva"};
		String target = "sena";
		boolean found = false;
		
		for(String str : names) {
			if(str.equals(target)) {
				found = true;
				break;
			}
		}
		System.out.println(found ? " present " : " not present ");
	}

}
