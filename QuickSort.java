package com.brainmentors.dsa.sorting;

public class QuickSort {
	
	public static void quickSort(int arr[], int first, int last)
	{
		int pivot, i, j, temp;
		
		if(first < last) //lower end < upper end
		{
			pivot = first;
			i = first;
			j = last;
			
			while(i < j)
			{
				while(arr[pivot] >= arr[i])
				{
					i++;
				}
				
				while(arr[pivot] < arr[j])
				{
					j--;
				}
				
				if(i < j)
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
			//swapping the pivot value
			temp = arr[pivot];
			arr[pivot] = arr[j];
			arr[j] = temp;
			
			//left sub-array
			quickSort(arr, 0, j - 1); // recursive call
			
			//right sub-array
			quickSort(arr, j + 1, last); // recursive call
		}
	}

	public static void printArray(int arr[])
	{
		System.out.println("\nQuick Sort is");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
	
		int arr[] = {35, 50, 15, 25, 80, 20, 90, 45};
		
		quickSort(arr, 0, arr.length - 1);
		
		printArray(arr);
	}

}
