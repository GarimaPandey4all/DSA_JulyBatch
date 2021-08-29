package com.brainmentors.dsa.recursion;

public class StackBuilding {
	
	public static void stackBuilding(int value)
	{
		if(value == 0)
		{
			return;
		}
		System.out.println(value+" ");
		stackBuilding(value - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stackBuilding(5);

	}
}
