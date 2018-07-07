package com.crackingthecode.LinkedLists;

import com.crackingthecode.LinkedLists.printingMiddleElement.Node;
//a function that counts the number of times a given int occurs in a Linked List
public class countOccurenceOfElement {
	
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
		
		public int countElement(int element){
			Node current=head;
			int count=0;
			
			while (current!=null){
				if(current.data == element){
					count++;
				}
				current = current.next;
			}
			
			return count;
		}
		
		public int countElementMethod2(Node current, int elemenet){
			/*
			 * 
			 */
			int count = 0;
			current = head;
			
//			if (current == null){
//				return count;
//			}
				while (current!=null){
					if(current.data == elemenet){
				
					count++;
				}
			 countElementMethod2(current.next, elemenet);
			
				}
			return count;
			
		}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		countOccurenceOfElement L_list = new countOccurenceOfElement();
		L_list.insertAtStart(5);
		L_list.insertAtend(6);
		L_list.insertAtend(7);
		L_list.insertAtend(8);
		L_list.insertAtend(9);
		L_list.insertAtend(10);
		L_list.insertAtend(8);
		L_list.insertAtend(12);
		L_list.insertAtend(8);
		L_list.printlist();
		int i = 8;
		System.out.println("Count of "+i+" is : "+L_list.countElement(i));
		System.out.println("Count of Method 2 of "+i+" is : "+L_list.countElementMethod2(L_list.head, i));

	}

}
