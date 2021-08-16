package com.brainmentors.dsa.arrays;

public class Problem_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Replace elements with greatest element on right side
		
		int arr[] = {17, 18, 5, 4, 6, 1}; // output = {18, 6, 6, 6, 1, -1};
		int max = arr[arr.length - 1];
		arr[arr.length - 1] = -1;
		
		for(int i = arr.length - 2; i >= 0; i--)
		{
			int temp = arr[i];
			arr[i] = max;
			
			if(temp > max)
			{
				max = temp;
			}
		}
		
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		
	}

}
