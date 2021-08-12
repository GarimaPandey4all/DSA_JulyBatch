package com.brainmentors.dsa.arrays;

public class Problem_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//How many numbers are smaller numbers than current number
		
		int arr[] = {8, 1, 2, 2, 3};
		int count = 0;
		int index = 0;
		
		int output[] = new int[arr.length];
		
		for(int i = 0; i < arr.length; i++, index++)
		{
			count = 0;
			for(int j = 0; j < arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
					count++;
				}
			}
			
			output[index] = count;
		}
		
		
		System.out.println("Array is: ");
		for(int i : output)
		{
			System.out.print(i+" ");
		}
		

	}

}
