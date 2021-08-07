package com.brainmentors.dsa.arrays;

import java.util.Arrays;

public class Problem_5 {

	public static void anagramString(String str1, String str2)
	{
		if(str1.length() != str2.length())
		{
			System.out.println("Not Anagram String");
			return;
		}
		
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		
		//Hashing - Hashmap - Hashtable (key : value pair type data store, O(1) for searching in hashing)
		
		int hash1[] = new int[256]; // by default value = 0
		int hash2[] = new int[256];
		
		for(int i = 0; i < arr1.length; i++)
		{
			++hash1[arr1[i]]; // 1
		}
		
		for(int i = 0; i < arr2.length; i++)
		{
			++hash2[arr2[i]]; // 1
		}
		
		for(int i = 0; i < hash1.length; i++)
		{
			if(hash1[i] != hash2[i])
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
		
		//Anagram String: Approach - 2
		
		anagramString("listen", "silent");

	}

}
