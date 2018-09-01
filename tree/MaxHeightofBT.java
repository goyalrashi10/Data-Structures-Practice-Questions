package com.crackingthecode.tree;

public class MaxHeightofBT {

	Node root;
	
	MaxHeightofBT(){
		root = null;
		
	}
	
	public int heightBT(Node node){
		
		if(node == null)
			return 0 ;
		else
		{
			int ldepth = heightBT(node.left);
			int rdepth = heightBT(node.right);
			
			if(ldepth>rdepth)
				return ldepth+1;
			else
				return rdepth+1;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MaxHeightofBT bt =new MaxHeightofBT();
		bt.root = new Node(1);
		bt.root.left = new Node(2);
		bt.root.right = new Node(3);
		bt.root.left.left = new Node(4);
		bt.root.left.left.left = new Node(5);
		System.out.println("Height of BT "+ bt.heightBT(bt.root));

	}

}
