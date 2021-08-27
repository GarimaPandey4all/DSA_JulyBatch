package com.brainmentors.java.recursion;

public class SumofDigits {
	
	public static int func(int n)
	{
		//base case / stop condition
		if(n == 1)
		{
			return n;
		}
		
		// processing logic
		int sum = n + func(n - 1); //  func(n - 1) - Small Problem
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int k;
		
		k = func(3);
		
		System.out.println("Sum of Digits "+k);

	}

}
