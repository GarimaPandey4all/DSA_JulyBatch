package com.brainmentors.dsa.sorting;

public class MergeSort {
	
	public static void mergeSort(int arr[], int n)
	{
		int temp[] = new int[n];
		
		for(int size = 1; size < n; size = size * 2)
		{
			int l1 = 0; // 0
			int k = 0; // index for temp array
			
			while(l1 + size < n)
			{
				int h1 = l1 + size - 1; // 0
				int l2 = h1 + 1; // 1
				int h2 = l2 + size - 1; // 1, 8 + 7 = 15
				
				//h2 exceeds the limit of the array
				if(h2 >= n)
				{
					h2 = n - 1; // 8
				}
				
				//merge two pairs
				
				int i = l1; // 0
				int j = l2; // 1
				
				while(i <= h1 && j <= h2)
				{
					if(arr[i] <= arr[j])
					{
						temp[k++] = arr[i++];
					}
					else {
						temp[k++] = arr[j++];
					}
				}
				
				while(i <= h1)
				{
					temp[k++] = arr[i++];
				}
				
				while(j <= h2)
				{
					temp[k++] = arr[j++];
				}
				
				//merge completed
				
				l1 = h2 + 1;
				
			}
			
			//any pair left
			for(int i = l1; i < n; i++)
			{
				temp[k++] = arr[i];
			}
			
			for(int i = 0; i < n; i++)
			{
				arr[i] = temp[i];
			}
			
			System.out.println("\nSize of "+size+" elements are");
			for(int i = 0; i < n; i++)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

	
	public static void printArray(int arr[])
	{
		System.out.println("\nMerge Sort is");
		for(int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	}
	
	public static void main(String[] args) {
	
		int arr[] = {11, 22, 44, 33, 11, 66, 55, 88, 77};
		
		mergeSort(arr, arr.length);
		
		printArray(arr);
	}

}
