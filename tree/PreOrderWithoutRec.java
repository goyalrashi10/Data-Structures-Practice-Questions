package com.crackingthecode.tree;

import java.util.Stack;

public class PreOrderWithoutRec {
	Node root;
	PreOrderWithoutRec ()
	{
		root= null;
	}
	
	void preOrder(){
		if(root==null)
			return;
		
		Stack<Node> s = new Stack<Node>();
		s.push(root);
		
		while(s.empty()==false){
			Node curr = s.peek();
			System.out.println(curr.data);
			s.pop();
			
			if(curr.right!=null)
				s.push(curr.right);
			
			if(curr.left!=null)
				s.push(curr.left);
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PreOrderWithoutRec bt = new PreOrderWithoutRec();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		bt.preOrder();

	}

}
