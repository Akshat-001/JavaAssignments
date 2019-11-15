package com;

import java.util.Scanner;

public class string_reverse_specialChar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String inp=sc.next();
		int n=inp.length();
		char ch[]= inp.toCharArray();
		int s=0,e=n-1;
		char t;
		for(int i=0;i<n;i++)
		{
			while(s!=e)
			{
				if(!((ch[s]>=65&&ch[s]<=90)||(ch[s]>=97&&ch[s]<=122)))
				{
					s++;
				}
				else if(!((ch[e]>=65&&ch[e]<=90)||(ch[e]>=97&&ch[e]<=122)))
				{
					e--;
				}
				else
				{
					t=ch[s];
					ch[s]=ch[e];
					ch[e]=t;
					s++;
					e--;
				}
			}
		}
		String res=new String(ch);
		System.out.println(res);
	}
}
