package com.crackingthecode.LinkedLists;

import java.util.HashSet;

import com.crackingthecode.LinkedLists.removeDuplicates.Node;

public class intersectingNode {

	Node head;

	public class Node {
		Node next;
		int data;
		boolean visited;

		Node(int d) {
			data = d;
			next = null;
			visited = false;
		}
	}

	public void insertAtStart(int d) {
		Node new_node = new Node(d);

		new_node.next = head;
		head = new_node;
	}

	public void insertAtend(int d) {
		Node new_node = new Node(d);
		Node temp = head;
		new_node.next = null;

		if (head == null) {
			head = new_node;
			return;
		}

		while (temp.next != null) {
			temp = temp.next;
		}

		temp.next = new_node;
		return;
	}

	public void printlist() {
		Node list = head;

		if (list == null) {
			System.out.println("empty list");
		}

		while (list != null) {
			System.out.println(":->" + list.data);
			list = list.next;
		}
	}

	public static int intersectingNode1(Node a, Node b) {
//Method 1(Simply use two loops)
		Node currentA = a;
		Node currentB;

		while (currentA.next != null) {
			currentB = b;
			while (currentB.next != null) {
				//System.out.println(currentA.data+" : " + currentB.data);
				if (currentA == currentB) {
					System.out.println(currentB.data);
					return currentB.data;
					
				}
				currentB = currentB.next;
			}
			currentA = currentA.next;
		}
		return 0;

	}
	
	public static int intersectingNode2 (Node a, Node b){
		//Method 2 (Mark Visited Nodes)
		Node currentA = a;
		Node currentB = b;
		
		while(currentA.next!=null){
			currentA.visited = true;
			currentA=currentA.next;
		
		}
		
		while(currentB.next!=null){
			if(currentB.visited){
				//System.out.println();
				return currentB.data;
			}
			
			currentB=currentB.next;
		}
		
		return 0;
	}
	
	public static int intersectingNodeUsingHash(Node a, Node b){
		//Method 7 (Use Hashing)
		Node currentA = a;
		Node currentB = b;
		HashSet<Node> set = new HashSet<Node>();
		
		while(currentA.next!=null){
			set.add(currentA);
			currentA=currentA.next;
		}
		
		while (currentB.next!=null){
			if(set.contains(currentB)){
				return currentB.data;
			}
			currentB=currentB.next;
		}
		
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intersectingNode a = new intersectingNode();
		intersectingNode b = new intersectingNode();

		a.insertAtStart(1);
		a.insertAtend(2);
		a.insertAtend(3);
		a.insertAtend(4);
		a.insertAtend(9);

		b.insertAtStart(6);
		b.head.next = a.head.next.next.next;

		a.printlist();
		System.out.println("-----------------");
		b.printlist();

		System.out.println("Intersecting data point " + intersectingNode1(a.head, b.head));

		System.out.println("Intersecting data point using 2nd Method  " + intersectingNode2(a.head, b.head));
		
		System.out.println("Intersecting data point using 3rd Method  " + intersectingNodeUsingHash(a.head, b.head));
	}

}
