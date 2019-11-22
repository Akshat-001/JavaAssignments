package com;

import java.util.Scanner;

public class max_subarray_element_greater_than_K
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
//		for(int i=0;i<n;i++)
//		{
//			for(int j=i;j<n;j++)
//			{
//				for(int k=i;k<=j;k++)
//				{
//					System.out.print(arr[k]);
//				}
//				System.out.println();
//			}
//		}
		System.out.println("Enter K");
		int k=sc.nextInt();
		int ct=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i;j<n;j++)
			{
				int max=0;
				for(int l=i;l<=j;l++)
				{
					if(max<arr[l])
					{
						max=arr[l];
					}
				}
				if(max>k)
					ct++;
			}
		}
		System.out.println(ct);
	}
}
