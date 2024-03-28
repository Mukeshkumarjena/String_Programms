package com.string.java;

public class CountVowels {

	public static void main(String[] args) {
		 String s2="My name is Enough";		
		 String s1=CovertoLowercase(s2);
		 System.out.println(s1);
		 int count=0; 
		 for(int k=0;k<s1.length();k++){
			 char ch = s1.charAt(k);

	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                count++;
		     }            
	     }
		 System.out.println(count);
	}

	
	static String CovertoLowercase(String s)
	{
		char[]ch=s.toCharArray();
		 for (int i = 0; i < ch.length; i++)
		 {           
	            if (ch[i] >= 'A' && ch[i] <= 'Z')
	            {
	            	ch[i] =  (char) (ch[i] - 'A' + 'a');
	            }            
	      }
		 return new String(ch);
   }
}
