package com.brainmentors.dsa.arrays;

public class Problem_12 {
	
	public static void reverse(int arr[], int index, int rotateTimes)
	{
		for(int i = index; i < rotateTimes; i++)
		{
			int temp = arr[i];
			arr[i] = arr[rotateTimes];
			arr[rotateTimes--] = temp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Rotate Array
		
		int arr[] = {90, 1, 20, 2, 4, 6, 100};
		int rotateTimes = 2;
		
		reverse(arr, 0, rotateTimes - 1); // 1 90 20 2 4 6 100
		
		System.out.println("1st Rotation");
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		
		reverse(arr, rotateTimes, arr.length - 1); // 1 90 100 6 4 2 20
		
		System.out.println("\n2nd Rotation");
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		
		reverse(arr, 0, arr.length - 1); // 20 2 4 6 100 90 1
		
		System.out.println("\n3rd Rotation");
		for(int i : arr)
		{
			System.out.print(i+" ");
		}
		

	}

}
