package com;

class Node4
{
	int data;
	Node4 left,right;
	Node4(int data)
	{
		this.data=data;
		left=right=null;
	}
}
public class print_LeafNode
{
	static Node4 root;
	public static void print_leaf(Node4 root)
	{
		if(root==null)
		{
			System.out.println("No tree created");
		}
		else {
				if(root.left==null && root.right==null)
				{
					System.out.print(root.data+" ");
				}
			else
			{
				print_leaf(root.left);
				print_leaf(root.right);
			}
		}
	}
	public static void main(String args[])
	{
		root=new Node4(1);
		root.left=new Node4(2);
		root.right=new Node4(3);
		root.left.left=new Node4(4);
		root.left.right=new Node4(5);
		root.right.right=new Node4(6);
		root.right.left=new Node4(7);
		print_leaf(root);
	}
}
