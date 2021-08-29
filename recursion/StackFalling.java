package com.brainmentors.dsa.recursion;

public class StackFalling {
	
	public static void stackFalling(int value)
	{
		if(value == 0)
		{
			return;
		}
		stackFalling(value - 1);
		System.out.println(value+" ");	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		stackFalling(5);

	}
}
