package com.dsa.searching;

import java.util.Arrays;
import java.util.List;

public class FindEleArrListLinear {

	public static void main(String[] args) {
		List<String> myList = Arrays.asList("pen","paper","pencil","book","bag");
		String target  = "book";
		
		for(int i=0; i<myList.size();i++) {
			if(myList.get(i).equals(target)) {
				System.out.println("found string:" + i +" -> " + myList.get(i));
				return;
			}
		}
		System.out.println("no element found....");
	}

}
