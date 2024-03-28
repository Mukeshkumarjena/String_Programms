package com.string.java;

public class CheckPallindrome {
	
	static boolean isPallindrome(String s){
		s=s.toLowerCase();
		int i=0,j=s.length()-1;
		while(i<j) {
			if(s.charAt(i) !=s.charAt(j)) return false;
			i++;
			j--;
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(isPallindrome("madam"));
	}

}
