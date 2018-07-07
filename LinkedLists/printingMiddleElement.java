package com.crackingthecode.LinkedLists;

import com.crackingthecode.LinkedLists.returnNthFromEnd.Node;
//Find the middle of a given linked list in C Java
public class printingMiddleElement {
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
		
		public int calcLengthLL(){
			/*
			 *  1) Initialize count as 0 
				2) Initialize a node pointer, current = head.
				3) Do following while current is not NULL
				     a) current = current -> next
				     b) count++;
				4) Return count 
			 */
			Node temp = head;
			int i=1;
			if(head == null)
			{
				System.out.println("List is empty");
				return 0;
			}
			
			while(/*temp != null && */temp.next!=null)
			{
				i++;
				temp=temp.next;
			}
			
			return i;
		}
		
		public void printMiddle(int len){
			
			//Traverse the whole linked list and count the no. of nodes. Now traverse the list again till count/2 and return the node at count/2.
			Node current = head;
			int i = 1;
			int mid=0;
			if (len%2==0){
				mid = len/2;
				System.out.println("Mid is "+mid);
			}
			
			else if (len%2==1){
				mid = (len+1)/2;
				System.out.println("Mid is "+mid);
			}
			
			while(i<mid){
				current = current.next;
				i++;
			}
			
			System.out.println("Middle Element is "+current.data);
			
		}
		public void printMiddleMethod2(){
			//Traverse linked list using two pointers. Move one pointer by one and other pointer by two. When the fast pointer reaches end slow pointer will reach middle of the linked list.
			Node ptr1=head;
			Node ptr2=head;
			
			if(head==null){
				System.out.println("List is empty");
			}
			
			while(ptr2!=null && ptr2.next!=null){
				ptr1 = ptr1.next;
				ptr2=ptr2.next.next;
			}
			
			System.out.println("Midlle Element by Method 2 is :" +ptr1.data);
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printingMiddleElement L_list= new printingMiddleElement();
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
		System.out.println("Length is :" +L_list.calcLengthLL());
		L_list.printMiddle(L_list.calcLengthLL());
		L_list.printMiddleMethod2();

	}

}
