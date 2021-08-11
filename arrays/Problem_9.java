package com.brainmentors.dsa.arrays;

import java.util.Arrays;

public class Problem_9 {
	
	public static void main(String[] args) {
		
		//Pair Sum - Two Pointer Approach
		
		int arr[] = {2, 9, 6, 3, 1, 10, 4};
		int k = 9;
		
		int i = 0;
		int j = arr.length - 1;
		
		Arrays.sort(arr);
		
		while(i < j)
		{
			if(arr[i] + arr[j] == k)
			{
				System.out.println("Pair sum is: "+arr[i] +" "+ arr[j]);
				return;
			}
			else if(arr[i] + arr[j] < k)
			{
				i++;
			}
			else if(arr[i] + arr[j] > k)
			{
				j--;
			}
		}
		
	}

}
