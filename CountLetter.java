package com.string.java;

public class CountLetter {

	public static void main(String[] args) {
		String s="Java is @# 123";
		
		int uc=0;
		int lc=0;
		int nc=0;
		int sp=0;
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch >= 'A' && ch<='Z')
				uc++;
			else if(ch >= 'a' && ch<= 'z')
				lc++;
			else if(ch>='0' && ch<='9')
				nc++;
			else
				sp++;
		}
		System.out.println("Upper Count= "+uc);
		System.out.println("Lower Count= "+lc);
		System.out.println("number Count= "+nc);
		System.out.println("Special Count= "+sp);
	}

}
