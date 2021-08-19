package com.brainmentors.dsa.arrays;

public class Problem_21 {
	
	static final int N = 4;
	
	public static void transpose(int A[][], int B[][])
	{
		
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				B[i][j] = A[j][i];
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int A[][] = {
					{1, 1, 1, 1},
					{2, 2, 2, 2},
					{3, 3, 3, 3},
					{4, 4, 4, 4}};
		
		int B[][] = new int[N][N];
		
		transpose(A, B);
		
		System.out.println("Result Matrix is:");
		
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				System.out.print(B[i][j]+" ");
			}
			System.out.println();
		}
	}

}
