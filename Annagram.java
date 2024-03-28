package com.string.java;

public class Annagram {

	public static void main(String[] args) {
		String s1="keep";
		String s2="peek";
		System.out.println(isAnagram(s1,s2));
	}
	
	public static boolean isAnagram(String s1,String s2){
		char[]ch1=s1.toCharArray();
		char[]ch2=s2.toCharArray();
		
		if(length(s1)!=length(s2))return false;
		
		for(int i=0;i<length(s1);i++)
		{
			boolean flag=false;
			for(int j=0;j<length(s2);j++)
			{
				if(ch1[i]==ch2[j]){
					ch2[j]='\u0000';
					flag=true;
					break;
				}
			}
			if(!flag) return false;
		}
		return true;
	}	
	public static int length(String s){
		int count=0;
		char[]ch=s.toCharArray();
		for(char m:ch){
			count++;
		}
		return count;
	}
}
