package com.crackingthecode.LinkedLists;

import com.crackingthecode.LinkedLists.removeDuplicates.Node;

public class swapNodes {
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
		
		public void pairWiseSwap(){
			//Start from the head node and traverse the list. While traversing swap data of each node with its next node’s data.
			Node current = head;
			int temp;
			
			while(current.next!=null){
				temp = current.data;
				current.data = current.next.data;
				current.next.data = temp;
				current = current.next.next; 
				System.out.println(current.data);
			}
		}
		
		public void swapGivenNodes(int x, int y){
			
			Node prevX = null, nodeX = head;
			Node prevY = null, nodeY = head;
			
			if(x==y){
				System.out.println("x=y. So no need of swapping");
				return;
			}
			
			while(nodeX!=null && nodeX.data!=x){
				prevX=nodeX;
				nodeX=nodeX.next;
			}
			
			while(nodeY!=null && nodeY.data!=y){
				prevY=nodeY;
				nodeY=nodeY.next;
			}
			
			if(nodeX==null||nodeY==null){
				System.out.println("One of the 2 gives data does not exist");
				return;
			}
			
			if(prevX!=null){
				prevX.next=nodeY;
			}
			else
				head=nodeY;
			
			if(prevY!=null)
				prevY.next=nodeX;
			else
				head=nodeX;
			
			Node temp = nodeX.next;
			nodeX.next = nodeY.next;
			nodeY.next = temp;
				
		}
		
		public void moveLastToFront(){
			/*
			 *i) Make second last as last (secLast->next = NULL).
			  ii) Set next of last as head (last->next = *head_ref).
			  iii) Make last as head ( *head_ref = last)
			 */
			
			Node prev_current=null;
			Node current = head;
			
			while (current.next!=null){
				prev_current=current;
				current=current.next;
			}
			
			prev_current.next=null;
			current.next=head;
			head= current;
			
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		swapNodes L_list = new swapNodes();
		L_list.insertAtStart(5);
		L_list.insertAtend(6);
		L_list.insertAtend(7);
		L_list.insertAtend(8);
		L_list.insertAtend(9);
		L_list.insertAtend(10);
		L_list.insertAtend(11);
		L_list.insertAtend(12);
		L_list.insertAtend(8);
		//System.out.println("Hello:");
		L_list.printlist();
		//System.out.println("Hello1");
		//L_list.pairWiseSwap();
		//System.out.println("After pairwise swap:");
		//L_list.printlist();
//		L_list.moveLastToFront();
//		System.out.println("After moving last node to front:");
//		L_list.printlist();
		L_list.swapGivenNodes(5, 10);
		System.out.println("After swapping given nodes");
		L_list.printlist();
		
		

	}

}
