package com.string.java;

public class ChangeCase {

	public static void main(String[] args) {
		// change the alternative Case
		String s="jAvA Is";
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			char ch1=ch[i];
		
			if(ch1 >= 'A' && ch1<='Z')
				ch[i]=(char) (ch1+32);
			else if(ch1 >= 'a' && ch1<= 'z')
				ch[i]=(char) (ch1-32);		
		}
			System.out.println(ch);
	}

}
