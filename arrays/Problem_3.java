package com.brainmentors.dsa.arrays;

public class Problem_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 3, 4};
		
		//X-OR
		
		/*
		 * 
		 * 1 ^ 3 ^ 4
		1 = 0001
		3 = 0011
		4 = 0100 ^
		    0110 = 6 = x
		    
		1 ^ 2 ^ 3 ^ 4
		
		1 = 0001
		2 = 0010
		3 = 0011
		4 = 0100 ^
			0100 = 4 = y
			
		x = 0110
		y = 0100 ^
			0010 = 2
		*/
		int x =0, y = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			x ^= arr[i];
		}
		
		//System.out.println(x);
		
		for(int i = 1; i <= arr.length + 1; i++)
		{
			y ^= i;
		}
		
		//System.out.println(y);
		
		System.out.println("Missing Number "+(x ^ y));
			
		
		/*
		int sum = 0;
		//o/p = 5
		
		//Approach - 1: Summation/Addition Based Approach
		
		/**
		 * sum = 31
		 * total sum = summation formula: (n + 1) * (n + 2)/2;
		 * (7 * 8)/2 = 7 * 4 = 28
		 * */
		/*
		for(int i = 0; i < arr.length; i++)
		{
			sum += arr[i];
		}
		
		int n = arr.length + 1;
		
		int totalSum = (n * (n + 1)) / 2;
		
		//System.out.println(totalSum);
		
		System.out.println("Missing Number: "+(totalSum - sum));
		*/
	
	}

}
