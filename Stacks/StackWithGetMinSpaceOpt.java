package com.crackingthecode.Stacks;
import java.util.*;

public class StackWithGetMinSpaceOpt {

	Stack<Integer> s = new Stack<>();
	int minEle;
	
	void getMin(){
		if(s.isEmpty()){
			System.out.println("Stack is emplty");
			return;
		}
		else
		{
			System.out.println("Min elemenet "+minEle);
		}
	}
	
	void pop(){
		if(s.isEmpty()){
			System.out.println("Stack is emplty");
			return;
		}
		
		int x= s.pop();
		if(x<minEle){
			System.out.println(minEle);
			minEle = 2*minEle - x;
		}
		else{
			System.out.println(x);
		}
			
	}
	
	void push(int x){
		if(s.isEmpty()){
			minEle = x;
			s.push(x);
			return;
		}
		
		if (x<minEle){
			int y  = 2*x-minEle;
			s.push(y);
			minEle = x;
		}
		else
		{
			s.push(x);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StackWithGetMinSpaceOpt s = new StackWithGetMinSpaceOpt();
		s.push(9);
		s.push(6);
		s.push(5);
		s.push(4);
		s.getMin();
		s.pop();
		s.getMin();
	}

}
