package com.crackingthecode.LinkedLists;

import com.crackingthecode.LinkedLists.lengthLinkedList.Node;
//Search an element in a Linked List (Iterative and Recursive)
public class searchInLinkedList {

Node head;
	
	class Node{
		Node next;
		int data;
		
		Node (int d)
		{
			data = d;
			next = null;
		}

	}
	
	public void insertAtStart(int new_data)
	{
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
		
	}
	
	public void insertAtend (int new_data)
	{
		Node new_node = new Node(new_data);
		
		if (head == null)
		{
			head = new_node;
			return;
		}
		
		new_node.next = null;
		Node x = head;
		
		while (x.next != null)
		{
			x = x.next;
		}
		
		x.next = new_node;
		return;
	}
	
	public void printlist (){
		Node List = head;
		
		if (head == null){
			System.out.println("Hello");
		}
		while (List != null)
		{
			System.out.println("  ::  "+List.data);
			List = List.next;
		}
		
	}
	
	public boolean searchGivenKey(Node current, int key){
		/*
		 *  2) Initialize a node pointer, current = head.
			3) Do following while current is not NULL
			    a) current->key is equal to the key being searched return true.
			    b) current = current->next
			4) Return false 
		 */
		 current = head;
		
		while(current != null){
		
			if (current.data == key)
			{
				
				return true;
			}
			current = current.next;
		}
		
		
		return false;
		
	}
	
	public boolean searchRecursive(Node current, int key){
		/*
		 * bool search(head, x)
			1) If head is NULL, return false.
			2) If head's key is same as x, return true;
			2) Else return search(head->next, x) 
		 */
		current = head;
		if (head == null)
		{
			return false;
		}
		
		if (current.data == key){
			return true;
		}
		return searchRecursive(current.next, key);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		searchInLinkedList L_list = new searchInLinkedList();
		L_list.insertAtStart(5);
		L_list.insertAtend(6);
		L_list.insertAtend(7);
		L_list.insertAtend(8);
		L_list.insertAtend(9);
		L_list.insertAtend(10);
		L_list.insertAtend(11);
		L_list.insertAtend(12);
		L_list.insertAtend(13);
		L_list.printlist();
		
		System.out.println("Key is present:" + L_list.searchGivenKey(L_list.head, -5));
		System.out.println("Key is present (Recursively):" + L_list.searchRecursive(L_list.head, 5));

	}

}
