package com.string.java;

public class FindMissChar {

	public static void main(String[] args) {

		String s="mukesh";
		
		for(char ch='a';ch<='z';ch++){
			if(!s.contains(String.valueOf(ch)))
			{
				System.out.print(ch +" ");
			}
		}
		
	}

}
