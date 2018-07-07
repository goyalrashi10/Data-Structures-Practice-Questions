package com.crackingthecode.LinkedLists;

import com.crackingthecode.LinkedLists.searchInLinkedList.Node;

public class returnNnode {
	
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
	
	public int returnKth(int k){
		/*
		 * 1. Initialize count = 0
		2. Loop through the link list
     	a. if count is equal to the passed index then return current
         node
     	b. Increment count
     	c. change current to point to next of the current.	
		*/
		
		Node current = head;
		int count = 0;
		
		while (current!=null)
		{
			if(count == k)
			{
				return current.data;
			}
			count++;
			current=current.next;
		}
		
		return 0;
	}
	public int returnKthRecursive(Node n, int k, int count){
		/*
		 * getnth(node,n)
		1. Initialize count = 1
		2. if count==n
     	return node->data
		3. else
    	return getnth(node->next,n-1)
    
		 */
		n = head;
		//int count = 0;
		
		System.out.println("count:"+count);
		System.out.println("k:"+k);
		
		if (count==k)
			return n.data;
		else {
			System.out.println("Hello");
			return 0;
			//return returnKthRecursive(n.next, k, count++);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		returnNnode L_list = new returnNnode();
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
		
		System.out.println("Value at kth:" + L_list.returnKth(16));
		System.out.println("Value at kth Recursive:" + L_list.returnKthRecursive(L_list.head, 2, 0));
	}
	

}
