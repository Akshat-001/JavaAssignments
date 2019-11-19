package com;

import java.util.Scanner;

public class countFreq_array
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int arr[]=new int [n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
	    {
	        int ct=1;
	        for(int j=i+1;j<n;j++)
	        {
	            if(arr[i]==arr[j]&&arr[i]!='\0')
	            {
	                ct++;
	                arr[j]='\0';
	            }
	        }
	        if(arr[i]!='\0')
	        	System.out.println("Count of "+arr[i]+" is "+ct);
	    }
	}
}
