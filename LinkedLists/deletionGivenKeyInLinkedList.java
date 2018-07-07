package com.crackingthecode.LinkedLists;

/*
 * This program contains three different methods of deleting a linked list
 * 1. deletionGivenKey - Given a ‘key’, delete the first occurrence of this key in linked list.
 * 2. deletionGivenPosition - Given a singly linked list and a position, delete a linked list node at the given position.
 * 3. deleteFullList - delete complete Linked List
 */

public class deletionGivenKeyInLinkedList {

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
	
	public void insertAfterNode(Node prev_node, int new_data)
	{
		
		if (prev_node == null){
			System.out.println("Error");
			return;
		}
		Node new_node = new Node(new_data);
		
		
		new_node.next = prev_node.next;
		prev_node.next = new_node;
		
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
	
	public void deletionGivenKey (int key){
		//Given a ‘key’, delete the first occurrence of this key in linked list.
		Node temp = head;
		Node prev = null;
		
		if (temp == null){
			System.out.println("Key not present");
			return;
		}
		if (temp!=null && temp.data == key){
			head = head.next;
		}
		
		while(temp!=null && temp.data!=key)
		{
			prev = temp;
			temp = temp.next;
		}
		
		prev.next = temp.next;
		
		
	}
	
	public void deletionGivenPosition(int position)
	{
		//Given a singly linked list and a position, delete a linked list node at the given position.
		Node temp = head;
		Node prev= null;
		int i = 0 ;
		
		if(position ==0)
		{
			head = head.next;
			return;
		}
		
		
		while(temp!=null && i!=position){
			
			i++;
			prev= temp;
			temp = temp.next;
		}
		
		if(temp==null || temp.next == null)
		{
			System.out.println("Position is greater then length of linked list");
			return;
		}
		
		prev.next = temp.next;
		return;
	}
	
	public void deleteFullList()
	{
		//delete complete Linked List
		head = null;
		System.out.println("Linked List is deleted");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		deletionGivenKeyInLinkedList L_list = new deletionGivenKeyInLinkedList();
		L_list.insertAtStart(5);
		L_list.insertAtend(6);
		L_list.insertAtend(7);
		L_list.insertAtend(8);
		L_list.insertAtend(9);
		L_list.insertAtend(10);
		L_list.printlist();
		
		//System.out.println("Calling deletion");
		//L_list.deletionGivenKey(8);
		//L_list.printlist();
		
		System.out.println("Calling deletion for position");
		L_list.deletionGivenPosition(10);
		L_list.printlist();
		
		System.out.println("Calling deletion of Linked List");
		L_list.deleteFullList();
		L_list.printlist();

	}

}
