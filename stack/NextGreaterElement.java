package com.brainmentors.dsa.stack;

public class NextGreaterElement {
	
	static class Stack {
		int top;
		int items[] = new int[100];
		
		void push(int value)
		{
			if(top == 99)
			{
				System.out.println("Stack Overflow");
			}
			else {
				items[++top] = value;
			}
		}
		
		int pop()
		{
			if(top == -1)
			{
				System.out.println("Stack Underflow");
				return -1;
			}
			else {
				int value = items[top--];
				return value;
			}
		}
		
		boolean isEmpty()
		{
			return (top == -1) ? true : false;
		}
		
	}
		
		static void NGE(int arr[], int n)
		{
			Stack stack = new Stack();
			stack.top = -1;
			int value, next, i = 0;
			
			stack.push(arr[0]);
			
			for(i = 1; i < n; i++) {
				next = arr[i];
				
				if(stack.isEmpty() == false)
				{
					value = stack.pop();
					
					while(value < next)
					{
						System.out.println(value +"-->"+next);
						
						if(stack.isEmpty() == true)
						{
							break;
						}
						
						value = stack.pop();
					}
					
					if(value > next)
					{
						stack.push(value);
					}
				}
				
				stack.push(next);
			}
		
		while(stack.isEmpty() == false)
		{
			value = stack.pop();
			next = -1;
			System.out.println(value+"-->"+next);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {11, 13, 21, 3};
		int n = arr.length;
		
		NGE(arr, n);

	}

}
