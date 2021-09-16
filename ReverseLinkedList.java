package com.brainmentors.dsa.linkedlist;

import com.brainmentors.dsa.linkedlist.KthNode.Node;

public class ReverseLinkedList {
	
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
	
	public static ReverseLinkedList insert(ReverseLinkedList list, int data)
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
	
	public static void printList(ReverseLinkedList list)
	{
		Node traverse = list.head;
		
		System.out.println("Linked List");
		while(traverse != null)
		{
			System.out.print(traverse.data+" ");
			traverse = traverse.next;
		}
	}
	
	public static void reverseLinkedList(ReverseLinkedList list)
	{
		Node prevNode, curNode;
		
		if(list.head != null)
		{
			prevNode = list.head;
			curNode = list.head.next;
			list.head = list.head.next;
			
			prevNode.next = null; // make first node as last node
			
			while(list.head != null)
			{
				list.head = list.head.next;
				curNode.next = prevNode;
				
				prevNode = curNode;
				curNode = list.head;
			}
			
			list.head = prevNode;
			
			System.out.println("\nSuccessfully Reversed List");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReverseLinkedList list = new ReverseLinkedList();
		
		list.insert(list, 10);
		list.insert(list, 20);
		list.insert(list, 30);
		list.insert(list, 40);
		list.insert(list, 50);
		list.insert(list, 60);
		list.insert(list, 70);

		reverseLinkedList(list);
		
		printList(list);

	}

}
