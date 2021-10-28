package com.brainmentors.dsa.bitmanipulation;

public class CheckPowerofTwo {
	
	public static boolean checkPowerOfTwo(int n)
	{
		return n != 0  && ((n & (n - 1)) == 0);
		
//		0111 - 7
//		0110 - 6
//		0110 - 6 is not equal to 0
//		
//		0010 0000 - 32
//		0001 1111 - 31
//		0000 0000 = 0
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//bitwise operators: &, |, ^, <<, >>
		
		System.out.println(checkPowerOfTwo(32) ? "Yes" : "No");
		System.out.println(checkPowerOfTwo(7) ? "Yes" : "No");

	}

}
