package com;

import java.util.Scanner;

public class subArray_window
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements");
		int n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter window size");
		int ws=sc.nextInt();
		int res[]=new int [n-ws+1];
		int x=0;
		
		if(ws<=n)
		{
		for(int i=0;i<=n-ws;i++)
		{
			int max=arr[i];
			for(int j=i+1;j<ws+i;j++)
			{
				if(max<=arr[j])
				{
					max=arr[j];
				}
			}
			res[x]=max;
			x++;
		}
		for(int i=0;i<n-ws+1;i++)
		{
			System.out.print(res[i]+" ");
		}
		}
		else
		{
			System.out.println("Window size too large");
		}
	}
}
