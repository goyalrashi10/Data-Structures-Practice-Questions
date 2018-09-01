package com.crackingthecode.tree;
class Node{
	Node left, right;
	int data;
	
	Node(int item){
		
		data=item;
		left = right = null;
	}
}
public class BinaryTree {

	Node root;
	BinaryTree ()
	{
		root= null;
	}
	
	void PrintPostorder(Node node){
		
		if(node == null)
			return;
		
		PrintPostorder(node.left);
		PrintPostorder(node.right);
		System.out.println(node.data);
		
		
	}
	
	void PrintInorder(Node node){
		if(node==null)
			return;
		
		PrintInorder(node.left);
		System.out.println(node.data);
		PrintInorder(node.right);
	}

	void PrintPreorder(Node node){
		if(node==null)
			return;
		System.out.println(node.data);
		PrintPreorder(node.left);
		PrintPreorder(node.right);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.right = new Node(5);
		
		System.out.println("Pre order");
		bt.PrintPreorder(bt.root);
		
		System.out.println("Post order");
		bt.PrintPostorder(bt.root);
		
		System.out.println("In order");
		bt.PrintInorder(bt.root);
	}

}
