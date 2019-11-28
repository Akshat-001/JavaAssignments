package com;

import java.util.Scanner;

class Node1
{
	int data;
	Node1 left,right;
	Node1(int data)
	{
		this.data=data;
		left=right=null;
	}
}
public class lowest_common_ancestor
{
	static Node1 root;
	static Node1 lc_ancestor(Node1 root,int x,int y)
	{
		if(root==null)
			return root;
		
		if(root.data==x||root.data==y)
			return root;
		
		Node1 lt=lc_ancestor(root.left, x, y);
		Node1 rt=lc_ancestor(root.right, x, y);
		
		if(lt!=null && rt!=null)
			return root;
		
		if(lt!=null)
			return lt;
		else
			return rt;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		lowest_common_ancestor tr=new lowest_common_ancestor();
		root=new Node1(1);
		root.left=new Node1(2);
		root.right=new Node1(3);
		root.left.left=new Node1(4);
		root.left.right=new Node1(5);
		root.right.left=new Node1(6);
		root.right.right=new Node1(7);
		
		System.out.println("Enter 2 values whose LCA is to be found");
		int n=sc.nextInt();
		int m=sc.nextInt();
		Node1 res=lc_ancestor(root,n,m);
		System.out.println("LCA of "+n+" and "+m+" = "+res.data);
	}
}
