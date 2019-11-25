package com;

import java.util.Scanner;
import java.util.Stack;

public class Prefix_To_Postfix
{
	static String postfix(String pre)
	{
		Stack<String> str=new Stack<String>();
		String post="";
		int n=pre.length();
		for(int i=n-1;i>=0;i--)
		{
			char ch=pre.charAt(i);
			
			if(Character.isLetter(ch))
			{
				str.push(ch+"");
			}
			else
			{
				String s1=str.pop();
				String s2=str.pop();
				post=s1+s2+ch;
				str.push(post);
			}
		}
		return post;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Prefix Expression");
		String pre=sc.next();
		System.out.println("Postfix Expression is:");
		System.out.println(postfix(pre));
	}
}
