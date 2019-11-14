package com;

import java.util.Scanner;

public class subarray_k_sum
{
	static void subarraySum(int a[],int k)
	{
		boolean bol=true;
		for(int i=0;i<a.length;i++)
		{
			int sum=0;
			for(int j=i;j<a.length;j++)
			{
				sum=sum+a[j];
				if(k==sum)
				{
					System.out.println("Starting index: "+i+" Ending index: "+j);
					bol=false;
					break;
				}
			}
			if(!bol)
			{
				break;
			}
		}
		if(bol)
		{
			System.out.println("Not in range");
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements:");
		int n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter k(sum):");
		int k=sc.nextInt();
		subarraySum(arr,k);
	}
}
