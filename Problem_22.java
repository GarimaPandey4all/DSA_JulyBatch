package com.brainmentors.dsa.arrays;

public class Problem_22 {

	public static int  count(int A[][])
	{
		int M = A.length; // rows
		int N = A[0].length; // cols
		
		int negative = 0;
		int i = 0, j = N - 1;
		
		while(i <= M - 1 && j >= 0)
		{
			if(A[i][j] < 0)
			{
				negative += j + 1;
				i++;
			}
			else {
				j--;
			}
		}		
		return negative;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		//Negative Number in Matrix
		int A[][] = {
				{-7, -3, -1, 3, 5},
				{-3, -2, 2, 4, 6},
				{-1, 1, 13, 5, 8},
				{3, 4, 7, 8, 9}};
		
		System.out.println("Total Negative Numbers are: "+count(A));

	}

}
