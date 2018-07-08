package com.crackingthecode.Stacks;
/*
 * METHOD 1
 * Java Program to implement a queue using two stacks 
 * Note that Stack class is used for Stack implementation
 */
import java.util.*;

public class queueUsingStack {
	
	static class Queue{
		Stack<Integer> stack1;
		Stack<Integer> stack2;
	}

	static void push(Stack<Integer> top, int data){
		
		top.push(data);
	}
	
	static int pop(Stack<Integer> top){
		
		if(top.isEmpty()){
			System.out.println("System Underflow");
			System.exit(0);
		}
		
		return top.pop();
		
	}
	
	static void enQue(Queue q, int x){
		/*
		 * enQueue(q,  x)
  		   1) Push x to stack1 (assuming size of stacks is unlimited).
		 */
		push(q.stack1, x);
	}
	
	static int deQue(Queue q){
		
		/*
		 * deQueue(q)
  		1) If both stacks are empty then error.
  		2) If stack2 is empty
       	While stack1 is not empty, push everything from stack1 to stack2.
  		3) Pop the element from stack2 and return it.
		 */
		
		int x;
		if (q.stack1.isEmpty()&& q.stack2.isEmpty()){
			System.out.println("Q is empty");
			System.exit(0);			
		}
		
		if(q.stack2.isEmpty()){
			if(!q.stack1.isEmpty()){
				x = pop(q.stack1);
				push(q.stack2, x);
			}
		}
		
		x = pop(q.stack2);
		return x;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q = new Queue();
		q.stack1 = new Stack<>();
		q.stack2 = new Stack<>();
		
		enQue(q, 1);
		enQue(q, 2);
		enQue(q, 3);
		
		System.out.println("De queued element " + deQue(q));
		System.out.println("De queued element " + deQue(q));
		
		enQue(q, 2);
		
		System.out.println("De queued element " + deQue(q));
		
	}

}
