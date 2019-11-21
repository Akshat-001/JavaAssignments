package com;

import java.util.*;

class Node4
{
	int key;
	Node4 left,right;
	Node4(int data)
	{
		key=data;
		left=right=null;
	}
}
public class check_BST
{
	static Node4 root;
	static ArrayList<Integer>al=new ArrayList<>();
	public static void inOrder(Node4 root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			al.add(root.key);
			inOrder(root.right);
		}
		return;
	}
	public static void check(ArrayList<Integer> a)
	{
		int n=a.size();
		int j=0;
		for(int i=0;i<n-1;i++)
		{
			if(a.get(i)<a.get(i+1))
			{
				j++;
			}
		}
		if(j+1==n)
		{
			System.out.println("The binary tree is a BST");
		}
		else
		{
			System.out.println("The binary tree is not a BST");
		}
	}
	public static void main(String args[])
	{
		check_BST tr=new check_BST();
		tr.root=new Node4(50);
		tr.root.left=new Node4(30);
		tr.root.right=new Node4(70);
		tr.root.left.left=new Node4(20);
		tr.root.left.right=new Node4(40);
		tr.root.right.left=new Node4(60);
		tr.root.right.right=new Node4(80);
		inOrder(root);
		check(al);
	}
}
