package com.crackingthecode.LinkedLists;

import com.crackingthecode.learn.*;
import java.util.*;

public class ctciQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 

		LinkedListNode first = new LinkedListNode();
		LinkedListNode second = first;
		LinkedListNode head = first;
		for (int i = 1; i < 8; i++) {
			second = new LinkedListNode(i % 2, null, null);
			first.setNext(second);
			second.setPrevious(first);
//			System.out.println("1 "+first);
//			System.out.println("2 "+second);
			first = second;
		}
		
		System.out.println(head.printForward());
		deleteDups1(head);
		//deleteDups2(head);
		System.out.println(head.printForward());
		
	}

	private static void deleteDups2(LinkedListNode head) {
		// TODO Auto-generated method stub
		LinkedListNode current = head;
		
		while( current != null){
			LinkedListNode runner = current;
			while(runner.next !=null){
				if (runner.next.data == current.data){
					runner.next= runner.next.next;
				}
				else 
					runner = runner.next;
			}
			current = current.next;
		}
	}

	private static void deleteDups1(LinkedListNode n) {
		// TODO Auto-generated method stub
		
		HashSet<Integer> set = new HashSet<Integer>();
		LinkedListNode prev= null;
		while (n!=null)
		{
			if(set.contains(n.data))
			{
				prev.next = n.next;
			}
			else
			{
				set.add(n.data);
				prev = n;
			}
			n = n.next;
		}
		System.out.println("previous:"+prev.printForward());

	}

}
