package com;

import java.util.Scanner;

public class pairs_sum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter N");
		int n=sc.nextInt();
		System.out.println("Enter M");
		int m=sc.nextInt();
		System.out.println("Enter K");
		int k=sc.nextInt();
		
		int a[]=new int [n];
		int b[]=new int [m];
		
		System.out.println("Enter values in A");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter values in B");
		for(int j=0;j<m;j++)
		{
			b[j]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				if((a[i]+b[j])==k)
				{
					System.out.print(a[i]+" "+b[j]+", ");
				}
			}
		}
	}
}
