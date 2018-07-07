package com.crackingthecode.LinkedLists;

import com.crackingthecode.LinkedLists.segregateEvenOdd.Node;

public class intersecting2Lists {
	
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
		
		public static void method1(Node a, Node b){
			
			Node currA = a;
			Node currB;
			Node res = null;
			
			while(currA.next!=null){
				currB = b;
				while(currB.next!=null){
					System.out.println(currA.data+" : "+currB.data);
					if(currA.data==currB.data){
						res = currB;
						//res = res.next;
						System.out.println("result : "+res.data);
					}
					//res = res.next;
					currB= currB.next;
				}
				currA=currA.next;
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		intersecting2Lists a = new intersecting2Lists();
		intersecting2Lists b = new intersecting2Lists();
		
		a.insertAtStart(1);
		a.insertAtend(2);
		a.insertAtend(3);
		a.insertAtend(4);
		a.insertAtend(5);
		a.insertAtend(6);
		
		b.insertAtStart(2);
		b.insertAtend(4);
		b.insertAtend(10);
		
		a.printlist();
		System.out.println("---------");
		b.printlist();
		
		System.out.println("---------");
		method1(a.head,b.head);

	}

}
