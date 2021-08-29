package com.brainmentors.dsa.recursion;

public class NestedRecursion {
	
	public static int func(int n)
	{
		if(n > 100)
		{
			return (n - 10);
		}
		else {
			return func(func(n + 11));
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(func(95));
		
	}

}
