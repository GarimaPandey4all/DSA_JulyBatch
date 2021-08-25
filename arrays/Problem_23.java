package com.brainmentors.dsa.arrays;

public class Problem_23 {
	
	static int N = 4;
	
	static void rotate90Clockwise(int arr[][])
	{
		for(int i = 0; i < N; i++)
		{
			for(int j = N - 1; j >= 0; j--)
			{
				System.out.print(arr[j][i]+" ");
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[][] = {
					  {1, 2, 3, 4},
					  {5, 6, 7, 8},
					  {9, 10, 11, 12},
					  {13, 14, 15, 16}};
		
		rotate90Clockwise(arr);
		

	}

}
