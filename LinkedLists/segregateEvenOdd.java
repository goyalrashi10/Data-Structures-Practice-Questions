package com.crackingthecode.LinkedLists;

import com.crackingthecode.LinkedLists.reverseLinkedList.Node;

public class segregateEvenOdd {
	
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
		
		public void EvenOddMethod1(){
			Node evenStart = null;
			Node evenEnd = null;
			Node oddStart = null;
			Node oddEnd = null;
			Node current = head;
			
			while(current!=null){
				if(current.data%2==0){
					if(evenStart==null){
						evenStart = current;
						evenEnd = evenStart;
					}
					else{
						
					
						evenEnd.next = current;
						evenEnd = evenEnd.next; 
						}
				}
				else
				{
					if(oddStart==null){
						oddStart = current;
						oddEnd=oddStart;
					}
					else{
						oddEnd.next = current;
						oddEnd = oddEnd.next;
					}
				}
				
				current = current.next;
			}
			
			evenEnd.next = oddStart;
			head  = evenStart;
			oddEnd.next = null;
			
			
		}
		
		public void evenOddMethod2(){
			Node oddStart = null;
			Node oddEnd = null;
			Node current = head;
			
			while(current!=null){
				if(current.data%2 == 0){
					current=current.next;
				}
				else{
					if(oddStart == null){
						oddStart=current;
						oddEnd=oddStart;
					}
					else
					{
						oddEnd.next = current;
						oddEnd = oddEnd.next;
					}
					Node temp = current;
					current.next = current.next.next;
					temp.next = null;
					System.out.println(""+current.data);
				}
			}
			
			current = oddStart;
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			segregateEvenOdd L_list = new segregateEvenOdd();
			L_list.insertAtStart(5);
			L_list.insertAtend(6);
			L_list.insertAtend(7);
			L_list.insertAtend(8);
			L_list.insertAtend(9);
			L_list.insertAtend(10);
			L_list.insertAtend(11);
			L_list.insertAtend(12);
			L_list.insertAtend(13);
			L_list.insertAtend(15);
			L_list.insertAtend(14);
			L_list.printlist();
			//L_list.EvenOddMethod1();
			
			System.out.println("After Even Odd Method 2 :");
			L_list.evenOddMethod2();
			L_list.printlist();

		}

}
