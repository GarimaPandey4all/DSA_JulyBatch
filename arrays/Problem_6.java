package com.brainmentors.dsa.arrays;

public class Problem_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {3, 2, 2, 3};
		int val = 3;
		
		int i = 0;
		
		for(int j = 0; j < arr.length; j++)
		{
			if(arr[j] != val)
			{
				arr[i] = arr[j];
				i++;
			}
		}
		
		//System.out.println(i); // 2
		for(int k = 0; k < i; k++)
		{
			System.out.print(arr[k]);
		}
	}

}
