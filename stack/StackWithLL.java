package com.brainmentors.dsa.stack;

public class StackWithLL {
	
	Node top;

	static class Node {
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public void push(int data)
	{
		Node newNode = new Node(data);
		
		if(top == null)
		{
			top = newNode;
		}
		else {
			Node temp = top;
			top = newNode;
			newNode.next = temp;
		}
		
		System.out.println(data+" Pushed into a stack");
	}
	
	public int pop()
	{
		int popped = Integer.MIN_VALUE;
		
		if(top == null)
		{
			System.out.println("Stack Underflow");
		}
		else {
			popped = top.data;
			top = top.next;
		}
		
		return popped;
	}
	
	public int peek()
	{
		if(top == null)
		{
			System.out.println("Stack Underflow");
			return Integer.MIN_VALUE;
		}
		else {
			return top.data;
		}
	}
	
	public boolean isEmpty()
	{
		if(top == null)
		{
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackWithLL stack = new StackWithLL();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack.pop()+" popped from the stack");
		System.out.println(stack.peek()+" peek value of the stack");
		
		if(stack.isEmpty())
		{
			System.out.println("Stack is empty. stack Underflow");
		}
		else {
			System.out.println("Stack is not empty");
		}
		
	}

}
