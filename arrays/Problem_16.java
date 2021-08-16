package com.brainmentors.dsa.arrays;

public class Problem_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Median of two sorted Array
		
		int arr1[] = {1, 2, 3, 4, 5};
		int arr2[] = {6, 7, 8, 9, 10};
		
		//output = 5
		
		int i, j, n;
		int m1, m2;
		
		i = j = 0;
		n = arr1.length;
		m1 = m2 = Integer.MIN_VALUE;
		
		for(int count = 0; count <= n; count++)
		{
			if(i == n)
			{
				m1 = m2;
				m2 = arr2[0];
				break;
			}
			
			else if(j == n)
			{
				m1 = m2;
				m2 = arr1[0];
				break;
			}
			
			if(arr1[i] <= arr2[j]) { // 1 <= 6, 2 <= 6
				
				m1 = m2; // min, 1, 2, 3, 4
				m2 = arr1[i]; // 1, 2, 3, 4
				i++; // 1, 2, 3, 4
			}
			else {
				m1 = m2;
				m2 = arr2[i];
				j++;
			}
		}
		
		System.out.println((m1 + m2)/2);
	}
}
