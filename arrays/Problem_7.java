package com.brainmentors.dsa.arrays;

public class Problem_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Remove Duplicate from the Sorted Array
		
		int arr[] = {0, 0, 1, 1, 1, 2, 2, 3, 4 };
		
		int i = 0;
		
		for(int j = 1; j < arr.length; j++)
		{
			if(arr[j] != arr[i])
			{
				i++;
				arr[i] = arr[j];
			}
		}
		
		System.out.println("Output is: "+(i + 1));

	}

}
