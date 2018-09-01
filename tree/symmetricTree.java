package com.crackingthecode.tree;

public class symmetricTree {

	Node root;
	
	Boolean isMirror(Node node1, Node node2){
		if(node1==null && node2==null)
			return true;
		
		if(node1!=null && node2!=null && node1.data == node2.data){
			return (isMirror(node1.left, node2.right)&& isMirror(node1.right, node2.left));
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		symmetricTree bt = new symmetricTree();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(2);
		bt.root.left.left = new Node(3);
		bt.root.right.right = new Node(4);
		
		if(bt.isMirror(bt.root, bt.root))
		{
			System.out.println("Mirror");
		}
		else
			System.out.println("No mirror");
				
	}

}
