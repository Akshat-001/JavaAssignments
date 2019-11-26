package com;

import java.util.Scanner;

public class removeDuplicate_string
{
	static void remDuplicate(String s)
	{
		if(s.length()<=1)
		{
			System.out.println(s);
		}
		String res="";
		for(int i=0;i<s.length();i++)
		{
			while(i<s.length()-1 && s.charAt(i)==s.charAt(i+1))
			{
				if(i<s.length()-2&&s.charAt(i)!=s.charAt(i+2))
				{
					i=i+2;
				}
				else
				{
					i++;
				}
			}
			if(i!=s.length()-1)
			{
				res=res+s.charAt(i);
			}
			if(i==s.length()-1 && s.charAt(i)!=s.charAt(i-1))
			{
				res=res+s.charAt(i);
			}
		}
		System.out.println(res);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String st=sc.next();
		remDuplicate(st);
	}
}
