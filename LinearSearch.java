package com.brainmentors.dsa.searching;

public class LinearSearch {
	
	public static int search(int arr[], int search)
	{
		int n = arr.length;
		for(int i = 0; i < n; i++)
		{
			if(search == arr[i])
			{
				return i;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 3, 4, 10, 40};
		int search = 10;
		
		int result = search(arr, search);
		
		if(result == -1)
		{
			System.out.println("Element is not found");
		}
		else {
			System.out.println("Element is found at index "+result);
		}

	}

}
