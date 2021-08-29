package com.brainmentors.dsa.recursion;

public class IndirectRecursion {
	
	public static void funcB(int n)
	{
		if(n > 1)
		{
			System.out.println(n);
			funcA(n / 2);
		}
	}
	
	public static void funcA(int n)
	{
		if(n > 0)
		{
			System.out.println(n);
			funcB(n - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// There may be more than one function and they are calling one 
		//another in a circular fashion.
		
		funcA(10);

	}

}
