package com.crackingthecode.LinkedLists;
import com.crackingthecode.LinkedLists.deletionGivenKeyInLinkedList.Node;

public class lengthLinkedList {

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
		int i=0;
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
	
	public int RecLengthLL(){
		/*
		 * int getCount(head)
			1) If head is NULL, return 0.
			2) Else return 1 + getCount(head->next) 
		 */
		return getNodeCount(head);
	}
	
	public int getNodeCount(Node a){
		if (a == null){
		return 0;
		}
		
		return  1+ getNodeCount(a.next);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lengthLinkedList L_list = new lengthLinkedList();
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
		
		System.out.println("Lentgh of this linked list is:" + L_list.calcLengthLL());
		System.out.println("Lentgh of this linked list Recursively is:" + (L_list.RecLengthLL()-1));

	}

}
