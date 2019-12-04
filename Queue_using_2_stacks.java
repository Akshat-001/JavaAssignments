package com;

class Node{
	int data;
	Node link;
	Node(){
		link=null;
	}
}
public class Queue_using_2_stacks
{
	public Node top;
	Queue_using_2_stacks(){
		top=null;
	}
	public void push(int data)
	{
		Node n=new Node();
		n.data=data;
		n.link=top;
		top=n;
	}
	public int pop()
	{
		int x=top.data;
		top=top.link;
		return x;
		
	}
	public void display()
	{
		Node temp=top;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp=temp.link;
		}
		System.out.println();
	}
    public static void main(String args[]) {
    	Queue_using_2_stacks q1=new Queue_using_2_stacks();
    	q1.push(10);q1.push(20);q1.push(30);
    	System.out.println("Stack formed is :");
    	q1.display();
    	Queue_using_2_stacks q2=new Queue_using_2_stacks();
    	q2.push(q1.pop());q2.push(q1.pop());q2.push(q1.pop());
    	System.out.println("Queue formed is :");
    //	q2.pop();
    	q2.display();
    }
}
