package com.brainmentors.dsa.sorting;

public class ShellSort {
	
	public static void shellSort(int arr[], int n)
	{
		int i, j, temp, s;
		
		s = n / 2; // size of shell // 2
		
		while(s > 0)
		{
			for(i = s; i < n; i++) // i = 2, 3
			{
				for(j = i - s; i >= 0; i = i - s) // j = 0
				{
					if(arr[j] > arr[j + s]) // 2 > 4
					{
						temp = arr[j];
						arr[j] = arr[j + s];
						arr[j + s] = temp;
					}
					else {
						break;
					}
				}
			}
			
			s = s / 2;
		}
	}

	public static void printArray(int arr[])
	{
		System.out.println("\nShell Sort is");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
	
		int arr[] = {11, 22, 44, 33, 11, 66, 55, 88, 77};
		
		shellSort(arr, arr.length);
		
		printArray(arr);
	}
	
}
