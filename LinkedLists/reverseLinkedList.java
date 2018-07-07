package com.crackingthecode.LinkedLists;

import com.crackingthecode.LinkedLists.removeDuplicates.Node;

public class reverseLinkedList {
Node head;
	
	public class Node{
		Node next;
		int data;
		
		Node (int d){
			data = d;
			next = null;
		}
	}
		
		public void insertAtStart(int d)
		{
			Node new_node = new Node(d);
			
			new_node.next = head;
			head= new_node;
		}
		
		public void insertAtend(int d)
		{
			Node new_node = new Node(d);
			Node temp = head;
			new_node.next = null;
			
			if (head == null){
				head = new_node;
				return;
			}
			
			while (temp.next!=null){
				temp = temp.next;
			}
			
			temp.next = new_node;
			return;
		}
		
		public void printlist(){
			Node list = head;
			
			if(list==null){
				System.out.println("empty list");
			}
			
			while(list!=null){
				System.out.println(":->"+list.data);
				list = list.next;
			}
		}
		
		public void reverse(){
			/*
			 * Initialize three pointers prev as NULL, curr as head and next as NULL.
			Iterate trough the linked list. In loop, do following.
			Before changing next of current,store next node
			next = curr.next
			Now change next of current
			his is where actual reversing happens
			curr.next = prev
			
			Move prev and curr one step forward
			prev = curr
			curr = next
			 */
			
			Node prev = null;
			Node next = null;
			Node current = head;
			
			while(current!=null){
				next = current.next;
				current.next = prev;
				prev= current;
				current = next;
				//System.out.println(current.data);
			}
			head = prev;//how is head previous
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reverseLinkedList L_list = new reverseLinkedList();
		L_list.insertAtStart(5);
		L_list.insertAtend(6);
		L_list.insertAtend(6);
		L_list.insertAtend(8);
		L_list.insertAtend(9);
		L_list.insertAtend(10);
		L_list.insertAtend(10);
		L_list.insertAtend(12);
		L_list.insertAtend(13);
		L_list.insertAtend(13);
		L_list.insertAtend(14);
		L_list.printlist();
		L_list.reverse();
		System.out.println("After reversing:");
		L_list.printlist();

	}

}
