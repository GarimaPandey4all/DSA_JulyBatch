package com.brainmentors.dsa.queue;

class Node {
	int key;
	Node next;
	
	Node(int key)
	{
		this.key = key;
		this.next = null;
	}
}

class QueueLL {
	Node front, rear;
	
	public QueueLL()
	{
		this.front = this.rear = null;
	}
	
	void enqueue(int key)
	{
		Node temp = new Node(key);
		
		//if queue is empty , then new node is front and rear both
		
		if(this.rear == null)
		{
			this.front = this.rear = temp;
			
			return;
		}
		
		//if queue is not empty
		this.rear.next = temp;
		this.rear = temp;
	}
	
	void dequeue()
	{
		if(this.front == null)
		{
			System.out.println("Queue is Empty");
			return;
		}
		
		Node temp = this.front;
		this.front = this.front.next;
		
		if(this.front == null)
		{
			this.rear = null;
		}
	}
}

public class QueueWithLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		QueueLL queue = new QueueLL();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(30);
		queue.enqueue(40);
		queue.enqueue(50);
		
		queue.dequeue();
		
		System.out.println("Front value is: "+queue.front.key);
		
		System.out.println("Rear value is: "+queue.rear.key);

	}

}
