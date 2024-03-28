package com.string.java;

public class ContainMethod {

	public static void main(String[] args) {

			String s="mukesh";
			char key='k';
			 System.out.println(contain1(s, key));
		}

			public static boolean contain1(String s,char key)
			{
				for(int i=0;i<s.length();i++)
				{
					if(s.charAt(i)==key) return true;
				}
				return false;
			}
	}


