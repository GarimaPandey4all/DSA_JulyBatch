package com.brainmentors.dsa.bitmanipulation;

public class OneOddOccur {
	
	// find one odd occur, single number 
	
	public static int oneOddOccur(int arr[], int n)
	{
		int result = 0;
		
		for(int i = 0; i < n; i++)
		{
			result = result ^ arr[i];
		}
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {2, 3, 4, 5, 5, 4, 3};
		
		System.out.println(oneOddOccur(arr, arr.length));
		
//		int a = 4, b = 5;
		
//		int temp = a;
//		a = b;
//		b = temp;
		
		// X- OR Operator
		
//		System.out.println("Before: "+a+" "+b);
//		
//		a = a ^ b; // a = 1
//		b = a ^ b; // b = 4
//		a = a ^ b; // a = 5
//		
//		System.out.println("After: "+a+" "+b);
		
//		System.out.println("Before: "+a+" "+b);
//		
//		a = a + b; // a = 1
//		b = a - b; // b = 4
//		a = a - b; // a = 5
//		
//		System.out.println("After: "+a+" "+b);
		
//		

	}

}
