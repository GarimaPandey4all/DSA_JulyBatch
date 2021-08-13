package com.brainmentors.dsa.arrays;

import java.util.ArrayList;

public class Problem_13 {
	
	public static void main(String[] args) {
		
		//Create a target array in the given order
		
		/*
		Create target array in the given order
		Input:
		nums[] = {0, 1, 2, 3, 4}
		index[] = {0, 1, 2, 2, 1}

		nums index 	target
		0		0		0		0
		1		1		4		0, 1
		2		2		1		0, 1, 2
		3		2		3		0, 1, 3, 2
		4		1		2		0, 4, 1, 3, 2

		Output:
		target[] = {0, 4, 1, 3, 2}
		*/
		
		int arr[] = {0, 1, 2, 3, 4};
		int index[] = {0, 1, 2, 2, 1};
		
		//output[0, 4, 1, 3, 2]
		
		ArrayList<Integer> target = new ArrayList<>();
		
		if(arr.length == index.length)
		{
			for(int i = 0; i < arr.length; i++)
			{
				target.add(index[i], arr[i]);
			}
			
			System.out.println(target);
		}
		
	}

}
