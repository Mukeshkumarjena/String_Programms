package com.string.java;

public class CountTimesOfLtrs {

	public static void main(String[] args) {

		String s="developers";
		int count=s.length()-s.replace("e","").length();
		System.out.println(count);
	}

}
