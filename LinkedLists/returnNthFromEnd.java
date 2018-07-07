package com.crackingthecode.LinkedLists;

import com.crackingthecode.LinkedLists.lengthLinkedList.Node;

/*
 * Given a Linked List and a number n, write a function that returns the value at the n’th node from end of the Linked List.
 */
public class returnNthFromEnd {
	
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
		
		public int returnFromLast(int n, int len){
			/*
			 *  (Use length of linked list)
				1) Calculate the length of Linked List. Let the length be len.
				2) Print the (len – n + 1)th node from the begining of the Linked List.
			 */
			Node current = head;
			int x = len-n-1;
			
			for(int i = 0; i <=x; i++)
			{
				current = current.next;
			}
			
			return current.data;
		}
	
		public int returnFromLastMethod2(int n){
			
			/*
			 * Method 2 (Use two pointers) 
				Maintain two pointers – reference pointer and main pointer. 
				Initialize both reference and main pointers to head. 
				First move reference pointer to n nodes from head. 
				Now move both pointers one by one until reference pointer reaches end. 
				Now main pointer will point to nth node from the end. Return main pointer.
			 */
			
			Node current = head;
			Node ref = head;
			int count = 0;
			
			while (count < n){
				if(ref==null){
					System.out.println("Error");
					return 0;
				}
				count++;
				ref = ref.next;
			}
			
			while(ref!=null){
				current=current.next;
				ref= ref.next;
			}
			return current.data;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		returnNthFromEnd L_list = new returnNthFromEnd();
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
		
		System.out.println("Value at kth from end :"+L_list.returnFromLast(3, L_list.calcLengthLL()));//Time complexity O(n)
		System.out.println("Value at kth from end Method 2 :"+ L_list.returnFromLastMethod2(3));//Time complexity O(n) -- SPace complexity O(1)
		
	}

	

}
