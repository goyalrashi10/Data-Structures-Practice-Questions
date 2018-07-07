package com.crackingthecode.LinkedLists;
import com.crackingthecode.learn.*;

/*
 * methods to insert a new node in linked list are discussed. A node can be added in three ways
1) At the front of the linked list
2) After a given node.
3) At the end of the linked list.
 */
public class testInsertLinedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		singleLinkedList llist = new singleLinkedList();
		llist.insertAtStart(5);
		//llist.insertAfterNode(llist.head, 6);
		llist.insertAtend(8);
		llist.printlist();
	}

}
