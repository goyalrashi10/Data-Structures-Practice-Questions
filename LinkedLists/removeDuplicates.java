package com.crackingthecode.LinkedLists;

import java.util.HashSet;

import com.crackingthecode.LinkedLists.detectingLoop.Node;

public class removeDuplicates {
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
		
		public void removeDuplicatesInSortedList(){
			/*
			 * Traverse the list from the head (or start) node. While traversing, compare each node with its next node. 
			 * If data of next node is same as current node then delete the next node. 
			 * Before we delete a node, we need to store next pointer of the node
			 */
			Node current = head;
			while (current.next!=null)
			{
				if(current.data==current.next.data){
					current.next = current.next.next;
				}
				
				else
					current=current.next;
			}
		}

		public void removeDuplicatesInUnSortedList(){
			/*
			 * METHOD 1 (Using two loops)
				This is the simple way where two loops are used. 
				Outer loop is used to pick the elements one by one and inner loop compares the picked element with rest of the elements.
			 */
			Node ptr1=head;
			Node ptr2;
			
			while(ptr1.next!=null){
				ptr2=ptr1;
				
				while(ptr2.next!=null){
					if(ptr1.data==ptr2.next.data){
						ptr2.next=ptr2.next.next;
						
					}
					else 
						ptr2=ptr2.next;
				}
				ptr1=ptr1.next;
			}
		}
		
		public void removeDupsUsingHash(){
			/*
			 * We traverse the link list from head to end. 
			 * For every newly encountered element, we check whether it is in the hash table: 
			 * if yes, we remove it; otherwise we put it in the hash table
			 */
			Node current = head;
			Node prev = null;
			HashSet<Integer> set = new HashSet<Integer>();
			
			while(current.next!=null){
				if(set.contains(current.data)){
					prev.next=current.next;
				}
				
				else{
					set.add(current.data);
					prev=current;
				}
				current=current.next;
			}
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		removeDuplicates L_list = new removeDuplicates();
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
		//L_list.removeDuplicatesInSortedList();
		//L_list.removeDuplicatesInUnSortedList();
		L_list.removeDupsUsingHash();
		System.out.println("After removing duplicates:");
		L_list.printlist();

	}

}
