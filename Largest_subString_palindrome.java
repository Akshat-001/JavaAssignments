package com;

import java.util.Scanner;

public class Largest_subString_palindrome
{
	static boolean checkPal(String str)
	{
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev+=str.charAt(i);
		}
		if(rev.equals(str))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	static String subPalindrome(String s)
	{
		int max=0;
		String pal="",t;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				if(checkPal(s.substring(i, j)))
				{
					t=s.substring(i, j);
					if(t.length()>max)
					{
						max=t.length();
						pal=t;
					}
				}
			}
		}
		if(pal.length()<0)
		{
			return "No Palindrome";
		}
		else
		{
			return pal;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(subPalindrome(str));
	}
}
