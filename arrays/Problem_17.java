package com.brainmentors.dsa.arrays;

public class Problem_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Input: nums = [3,1,2,4]
		Output: [2,4,3,1]
		Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
		*/
		
		int arr[] = {3, 1, 2, 4};
		int output[] = new int[arr.length];
		int t = 0;
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 0) // even
			{
				output[t++] = arr[i];
			}
		}
		
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] % 2 == 1) // odd
			{
				output[t++] = arr[i];
			}
		}
		
		System.out.println("Sorted Parity Array:");
		
		for(int i : output)
		{
			System.out.print(i+" ");
		}
	}

}
