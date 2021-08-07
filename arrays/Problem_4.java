package com.brainmentors.dsa.arrays;

import java.util.Arrays;

public class Problem_4 {
	
	public static void anagramString(String str1, String str2)
	{
		if(str1.length() != str2.length())
		{
			System.out.println("Not Anagram String");
			return;
		}
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		
		//sort
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for(int i = 0; i < arr1.length; i++)
		{
			if(arr1[i] != arr2[i])
			{
				System.out.println("Not Anagram String");
				//return;
				System.exit(0); // exit the program
			}
		}
		
		System.out.println("Anagram String");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		anagramString("listen", "sileot");

	}

}
