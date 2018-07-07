package com.crackingthecode.LinkedLists;
import com.crackingthecode.learn.*;


public class ctciQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListNode first = new LinkedListNode();
		LinkedListNode second = first;
		LinkedListNode head = first;
		for (int i = 1; i < 8; i++) {
			second = new LinkedListNode(i, null, null);
			first.setNext(second);
			second.setPrevious(first);
			first = second;
			}
		
		System.out.println(head.printForward());
		deleteNode(head.next.next.next);
		System.out.println(head.printForward());
		}

	private static boolean deleteNode(LinkedListNode n) {
		// TODO Auto-generated method stub
		if (n==null|| n.next == null){
			return false;
		}
		LinkedListNode next1 = n.next;
		n.data = next1.data;
		n.next = next1.next;
		return true;
		
	}

}
