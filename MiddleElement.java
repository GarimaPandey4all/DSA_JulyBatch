package com.brainmentors.dsa.linkedlist;

public class MiddleElement {
	
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	public static MiddleElement insert(MiddleElement list, int data)
	{
		Node newNode = new Node(data);
		newNode.next = null;
		
		if(list.head == null)
		{
			list.head = newNode;
		}
		else {
			Node traverse = list.head;
			
			while(traverse.next != null)
			{
				traverse = traverse.next;
			}
			
			traverse.next = newNode;
		}
		
		return list;
	}
	
	public static void midPoint(MiddleElement list)
	{
		Node slow = list.head;
		Node fast = list.head;
		
		if(list.head != null)
		{
			while(fast != null && fast.next != null)
			{
				slow = slow.next; // 1 step
				fast = fast.next.next; // 2 steps
			}
			
			System.out.println(slow.data);
		}
	}
	
	public static void printList(MiddleElement list)
	{
		Node traverse = list.head;
		
		System.out.println("Linked List");
		while(traverse != null)
		{
			System.out.print(traverse.data+" ");
			traverse = traverse.next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MiddleElement list = new MiddleElement();
		
		list.insert(list, 10);
		list.insert(list, 20);
		list.insert(list, 30);
		list.insert(list, 40);
		list.insert(list, 50);
		list.insert(list, 60);
		list.insert(list, 70);
		
		midPoint(list);
		
		printList(list);

	}

}
