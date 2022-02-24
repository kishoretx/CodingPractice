package com.kk;

//Java program to Add an Element
//to the Front of LinkedList

import java.io.*;

class MyLinkedList {
	
	// head reference
	Node head;
	
	// Node class
	class Node {
		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}
	
	// Inserting node at the front
	public void insertfront(int data)
	{
		// Allocating and inserting the data in that node
		Node new_node = new Node(data);
		
		// Make the next of the newly allocated node to be
		// the head
		new_node.next = head;
		
		// Now make the head to be the newly allocated node
		head = new_node;
	}
	
	// Printing the List
	public void print()
	{
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String args[])
	{
		// create a linkedlist
		MyLinkedList l = new MyLinkedList();
		
		// insert elements at the front
		l.insertfront(6);
		l.insertfront(5);
		l.insertfront(8);
		l.insertfront(9);
		
		// print the linkedlist
		l.print();
	}
}
