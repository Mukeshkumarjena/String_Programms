package com.string.java;

public class ArrangeString {

	public static void main(String[] args) {
		// 1.Number, 2.up, 3.lc, 4.sc
		String s="Ram @123";
		String uc="";
		String lc="";
		String nc="";
		String sp="";
		
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch >= 'A' && ch<='Z')	
				uc+=ch;
			else if(ch >= 'a' && ch<= 'z')
				lc+=ch;
			else if(ch>='0' && ch<='9')
				nc+=ch;
			else
				sp+=ch;
	}
		String res=nc+uc+lc+sp;
		System.out.print(res);

	}

}
