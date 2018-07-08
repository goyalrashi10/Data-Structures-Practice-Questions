package com.crackingthecode.Stacks;
import java.util.*;

import com.crackingthecode.Stacks.queueUsingStack.Queue;


public class queueViaStack_Method2_FunctionCall {
	
	static class Queue{
		
		Stack<Integer> stack1;
		
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
		int x, res = 0;
		if (q.stack1.isEmpty()){
			System.out.println("Q is empty");
			System.exit(0);
		}
		else if(q.stack1.size()==1){
			return pop(q.stack1);
		}
		else{
			x = pop(q.stack1);
			res = deQue(q);
			push(q.stack1, x);
			return res;
		}
		
		return 0;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue q = new Queue();
		q.stack1 = new Stack<>();
		
		enQue(q, 1);
		enQue(q, 2);
		enQue(q, 3);
		
		System.out.println("De queued element " + deQue(q));
		System.out.println("De queued element " + deQue(q));
		
		enQue(q, 2);
		
		System.out.println("De queued element " + deQue(q));

	}

}
