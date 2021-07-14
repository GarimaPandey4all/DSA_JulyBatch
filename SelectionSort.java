package com.brainmentors.dsa.sorting;

public class SelectionSort {
	
	public static void selectionSort(int arr[], int n)
	{
		for(int i = 0; i < n - 1; i++)
		{
			int min = i; // 0
			for(int j = i + 1; j < n; j++) // j = 2, 3, 4, 5
			{
				if(arr[j] < arr[min]) // 34 < 64, 25 < 34, 12 < 25, 22 < 12
				{
					min = j; // 1, 2, 3
				}
			}
			
			//swapping
			
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	
	public static void printArray(int arr[])
	{
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
	
		int arr[] = {64, 34, 25, 12, 22, 11, 90};
		
		selectionSort(arr, arr.length);
		
		printArray(arr);
	}

}
