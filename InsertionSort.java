package com.brainmentors.dsa.sorting;

public class InsertionSort {
	
	public static void insertionSort(int arr[], int n)
	{
		for(int i = 1; i < n; i++)
		{
			int temp = arr[i];
			int j = i - 1;
			while(j >= 0 && arr[j] > temp)
			{
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			
			arr[j + 1] = temp;
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
		
		insertionSort(arr, arr.length);
		
		printArray(arr);
	}

}
