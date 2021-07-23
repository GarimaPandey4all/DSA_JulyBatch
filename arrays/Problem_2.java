package com.brainmentors.dsa.arrays;

public class Problem_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {16, 17, 4, 3, 5, 2};		
		int max = 0;
		
		for(int i = arr.length - 1; i >= 0; i--) {
			if(arr[i] > max) {
				System.out.println("Leader " +arr[i]);
				max = arr[i];
			}
		}
		
		
		/*
		i = 0
		j = 1
		16 > 17, arr[i] > arr[j]
		16 > 4
		16 > 3
		.
		.
		.
		
		if(j == n)
		{
			leader element
		}*/
	
	}

}
