package com.crackingthecode.tree;

import java.util.Stack;

public class InOrderWithoutRecursion {
	Node root;
	InOrderWithoutRecursion ()
	{
		root= null;
	}
	
	void inOrder(){
		
		if(root==null)
			return;
		
		Stack<Node> s = new Stack<Node>();
		
		Node curr =root;
		
		while(curr!=null || s.size()>0){
			while(curr!=null){
				s.push(curr);
				curr = curr.left;
			}
			
			curr = s.pop();
			System.out.println(curr.data);
			curr = curr.right;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InOrderWithoutRecursion bt = new InOrderWithoutRecursion();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		bt.inOrder();
		
	}

}
