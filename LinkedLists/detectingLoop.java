package com.crackingthecode.LinkedLists;

import java.util.*;

import com.crackingthecode.LinkedLists.countOccurenceOfElement.Node;

//Write a function detectAndCountLoop() that checks whether a given Linked List contains loop 
//if loop is present then returns count of nodes in loop

public class detectingLoop {
	
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
		
		public boolean detectLoopUsingHash(){
			/*
			 * Use Hashing:
				Traverse the list one by one and keep putting the node addresses in a Hash Table. 
				At any point, if NULL is reached then return false and if next of current node points to any of the previously stored nodes 
				in Hash then return true
			 */
			
			HashSet<Node> set = new HashSet<Node>();
			Node current = head;
			
			while(current!=null){
				if(set.contains(current)){
					return true;
				}
				set.add(current);
				current=current.next;
			}
			
			return false;
		}
		
		public boolean detectLoopUsingFloyd(){
			/*
			 * Floyd’s Cycle-Finding Algorithm:
				This is the fastest method. Traverse linked list using two pointers.  
				Move one pointer by one and other pointer by two.  If these pointers meet at some node then there is a loop.  
				If pointers do not meet then linked list doesn’t have loop.
			 */
			Node ptr1 = head;
			Node ptr2 = head;
			
			while(ptr1!=null && ptr2!=null && ptr2.next!=null){
				ptr1= ptr1.next;
				ptr2 = ptr2.next.next;
				if(ptr1==ptr2){
					return true;
				}
			}
			return false;
		}
		
		public int detectLoopUsingFloyd1(){
			//this method is different from above only in terms of return type. I wrote this only for counting loop. 
			Node ptr1 = head;
			Node ptr2 = head;
			
			while(ptr1!=null && ptr2!=null && ptr2.next!=null){
				ptr1= ptr1.next;
				ptr2 = ptr2.next.next;
				if(ptr1==ptr2){
					return countDetectedLoopNodes(ptr1);
				}
			}
			return 0;
		}

		public int countDetectedLoopNodes(Node a){
			Node temp = a;
			int count = 1;
			
			while(temp.next!=a){
				//System.out.println(temp.data);
				count++;
				temp = temp.next;
				//System.out.println(count);
				//System.out.println(temp.data);
			}
			return count; //extra added +1 because the loop is not able to count last node
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		detectingLoop L_list = new detectingLoop();
		L_list.insertAtStart(5);
		L_list.insertAtend(6);
		L_list.insertAtend(7);
		L_list.insertAtend(8);
		L_list.insertAtend(9);
		//L_list.insertAtend(10);
		//L_list.insertAtend(11);
		//L_list.insertAtend(12);
		//L_list.insertAtend(8);
		L_list.head.next.next.next.next.next = L_list.head.next.next;
		//L_list.printlist();
		System.out.println("Is there a loop:" + L_list.detectLoopUsingHash());
		System.out.println("Is there a loop using Floyd's metthod:" + L_list.detectLoopUsingFloyd());
		System.out.println("Number of nodes in this loop are : "+ L_list.detectLoopUsingFloyd1());
		
	}

}
