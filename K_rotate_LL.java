package com;

import java.util.Scanner;

class Node8
{
	int data;
	Node8 next;
	Node8()
	{
		data=0;
	}
	Node8(int d)
	{
		data=d;
	}
}
public class K_rotate_LL
{
	static Node8 head;
	public static void insert(int val)
	{
		Node8 n=new Node8(val);
 		if(head==null)
		{
			head=n;
		}
		else
		{
			Node8 last=head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=n;
		}
	}
	public static int delete()
	{
		if(head==null)
		{
			System.out.println("Empty list");
		}
		else
		{
			int data=head.data;
			head=head.next;
			return data;
		}
		return 0;
	}
	public static void view()
	{
		Node8 temp=head;
		if(temp==null)
			System.out.println("Empty list");
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	public static void main(String args[])
	{
		K_rotate_LL ll=new K_rotate_LL();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			insert(sc.nextInt());
		}
		System.out.println("Enter the number of rotations");
		int k=sc.nextInt();
		for(int j=0;j<k;j++)
		{
			insert(delete());
		}
		System.out.println("After rotations");
		view();
	}
}
