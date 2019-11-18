package com;

import java.util.Scanner;

class Node7
{
	int data;
	Node7 next;
	Node7()
	{
		data=0;
		next=null;
	}
	Node7(int d)
	{
		data=d;
		next=null;
	}
}

public class LL_remove_duplicate
{
	static Node7 head;
	public static void insert(int d)
	{
		Node7 n=new Node7(d);
 		if(head==null)
		{
			head=n;
		}
		else
		{
			Node7 last=head;
			while(last.next!=null)
			{
				last=last.next;
			}
			last.next=n;
		}
	}
	public static void remove_duplicate()
	{
		Node7 t=head;
		while(t!=null)
		{
			Node7 t1=t;
			while(t1.next!=null)
			{
				if(t1.next.data==t.data)
				{
					t1.next=t1.next.next;
				}
				else
				{
					t1=t1.next;
				}
			}
			t=t.next;
		}
	}
	public static void view()
	{
		if (head == null) {
			System.out.println("List is empty");
			}

			Node7 temp = head;
			while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
			}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			insert(sc.nextInt());
		}
		remove_duplicate();
		view();
	}
}
