package com;

class Node2
{
	int data;
	Node2 left,right;
	Node2(int data)
	{
		this.data=data;
		left=right=null;
	}
}
public class leftView_BT
{
	static Node2 root;
	leftView_BT()
	{
		root=null;
	}
	static int k=0;
	static void print(Node2 root,int i)
	{
		if(root==null)
		{
			return;
		}
		if(k<i)
		{
			System.out.println(root.data+" ");
			k=i;
		}
		print(root.left,i+1);
		print(root.right,i+1);
	}
	public static void main(String args[])
	{
		root=new Node2(1);
		root.left=new Node2(2);
		root.right=new Node2(3);
		root.left.left=new Node2(4);
		root.left.right=new Node2(5);
		root.right.left=new Node2(6);
		root.right.right=new Node2(7);
		print(root,1);
	}
}
