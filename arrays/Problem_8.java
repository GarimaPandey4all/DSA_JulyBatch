package com.brainmentors.dsa.arrays;

public class Problem_8 {
	
	public static void main(String[] args) {
		
		//Pair Sum
		
		int arr[] = {2, 9, 6, 3, 1, 10, 4};
		int k = 9;
		
		//Hashtable
		
		int hash[] = new int[100];
		
		for(int i = 0; i < arr.length; i++)
		{
			int index = k - arr[i];
			
			if(hash[index] == 1)
			{
				System.out.println("Pair is"+arr[i]+" "+index);
				break;
			}
			
			hash[arr[i]] = 1;
		}
		
	}

}
