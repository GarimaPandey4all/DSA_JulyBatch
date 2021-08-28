package com.brainmentors.dsa.recursion;

public class LinearRecursion {
	
	static void func(int n)
	{
		if(n > 0)
		{
			System.out.println("Print First: "+n);
			func(n - 1);
			System.out.println("Print Last: "+n);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Linear recursion is a function that only makes a single 
		call to itself each time the function runs.
		*/
		
		func(3);

	}

}
