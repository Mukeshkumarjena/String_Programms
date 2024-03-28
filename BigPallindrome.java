package com.string.java;

public class BigPallindrome {

	public static void main(String[] args) {
		String s1="malayalam";
		String bigpall="";
		for(int i=0;i<s1.length();i++){		
			for(int j=i+2;j<=s1.length()-2;j++) //if u -1 then malayalam will output
			{
				if(isPallindrome(s1,i,j))
				{
					String s2=s1.substring(i,j+1);
					if(s2.length()>bigpall.length())
					{
						bigpall=s2;
					}				
				}	
			}
		}
		System.out.println(bigpall);
	}

	private static boolean isPallindrome(String s, int start, int end) {
		int i=start,j=end;
		while(i<j){
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}

}
