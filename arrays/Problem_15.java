package com.brainmentors.dsa.arrays;

public class Problem_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Find two repeating elements in an Array
		
		int arr[] = {2, 4, 3, 1, 2, 5, 4};
		//output: 2, 4
		
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = i+1; j < arr.length; j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.print(arr[i]+" ");
				}
			}
		}
	}

}
