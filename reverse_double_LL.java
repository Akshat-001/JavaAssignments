package com;

import java.util.Scanner;

import com.Menu_driven_doubly_Linked_List.Node;

class Node9
{
	int data;
	Node9 prev;
	Node9 next;

	Node9(int d) {
	data = d;
	next = null;
	prev = null;
	}
}
public class reverse_double_LL
{
	static Node9 head,tail;
	public static void insert(int data)
	{
		Node9 n = new Node9(data);
		n.next = null;
		n.prev = null;

		if (head == null) {
		head = n;
		tail = n;
		}

		else {
		tail.next = n;
		n.prev = tail;
		tail = n;
		}
	}
	public static void displayReverse()
	{
		Node9 temp = tail;
		if (head == null) {
		System.out.println("List is empty");
		return;
		}
		while (temp != null) {
		System.out.println(temp.data);
		temp = temp.prev;
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n = sc.nextInt();
		System.out.println("Enter elements");
		for (int i = 0; i < n; i++)
		{
			insert(sc.nextInt());
		}
		displayReverse();
	}
}
