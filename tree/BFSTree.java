package com.crackingthecode.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTree {
	Node root;
	BFSTree(){
		root = null;
	}
	
	void printBFS(){
		if (root ==null)
			return;
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		while(!q.isEmpty())
		{
			Node t = q.poll();
			System.out.println(t.data);
			
			if(t.left!=null)
				q.add(t.left);
			
			if(t.right!=null)
				q.add(t.right);
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BFSTree bt = new BFSTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		System.out.println("----");
		bt.printBFS();

	}

}
