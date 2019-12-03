package com;

import java.util.*;

public class phonebook_hashmap
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		HashMap<String,Integer> hm=new HashMap<String,Integer>();
		System.out.println("Enter the number of contacts");
		int n=sc.nextInt();
		System.out.println("Enter the contacts");
		for(int i=0;i<n;i++)
		{
			hm.put(sc.next(), sc.nextInt());
		}
		System.out.println("Enter the number of queries");
		int q=sc.nextInt();
		for(int i=0;i<q;i++)
		{
			System.out.println("Enter name");
			String k=sc.next();
			if(hm.get(k)!=null)
			{
				System.out.println(k+" "+hm.get(k));
			}
			else
			{
				System.out.println("Not found");
			}
		}
	}
}
