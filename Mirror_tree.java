package com;

class Node3
{
	int data;
	Node3 left,right;
	Node3(int data)
	{
		this.data=data;
		left=right=null;
	}
}
public class Mirror_tree
{
	static Node3 root;
	static boolean Mirror(Node3 root1,Node3 root2)
	{
		if(root1==null && root2==null)
		{
			return true;
		}
		else if(root1!=null && root2!=null && root1.data==root2.data)
		{
			return (Mirror(root1.left,root2.right) && Mirror(root1.right,root2.left));
		}
		return false;
	}
	public static void main(String args[])
	{
		root=new Node3(2);
		root.left=new Node3(4);
		root.right=new Node3(4);
		root.left.left=new Node3(6);
		root.right.right=new Node3(6);
		boolean res=Mirror(root,root);
		if(res)
		{
			System.out.println("Mirror tree");
		}
		else
		{
			System.out.println("Not Mirror tree");
		}
	}
}
