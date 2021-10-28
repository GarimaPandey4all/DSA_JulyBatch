package com.brainmentors.dsa.dp;

public class FibonacciSeries
{
	public static int fib(int n, int cache[])
	{
		if(n == 0 || n == 1)
		{
			return n;
		}
		
		if(cache[n] != 0)
		{
			return cache[n];
		}
		
		int first = fib(n - 1, cache);
		int second = fib(n - 2, cache);
		int sum = first + second;
		
		cache[n] = sum;
		
		return cache[n];
	}
	
	public static void main(String[] args) {
		
		//top-down: Memoization
		
		int n = 5;
		
		int cache[] = new int[n + 1];
		
		System.out.println(fib(n, cache));
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
//    static int fib(int n)
//    {
//	    if (n <= 1)
//	       return n;
//	    
//	    return fib(n-1) + fib(n-2);
//    }
//      
//    public static void main (String args[])
//    {
//	    int n = 4;
//	    System.out.println(fib(n));
//    }
}
