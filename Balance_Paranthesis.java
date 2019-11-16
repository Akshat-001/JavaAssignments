package com;

import java.util.*;

public class Balance_Paranthesis
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input");
		String s=sc.next();
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='[')
			{
				st.push(s.charAt(i));
			}
			else if((s.charAt(i)==')'&&st.peek()=='(')||(s.charAt(i)=='}'&&st.peek()=='{')||(s.charAt(i)==']'&&st.peek()=='['))
			{
				st.pop();
			}
		}
		if(st.isEmpty())
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Not Balanced");
		}
	}
}
