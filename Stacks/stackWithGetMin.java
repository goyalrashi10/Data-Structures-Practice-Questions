/**
 * 
 */
package com.crackingthecode.Stacks;

import java.util.*;

/**
 * @author rashigoyal
 *
 */
public class stackWithGetMin extends Stack<Integer>{

	/**
	 * @param args
	 */
	
	Stack<Integer> aux = new Stack<>();
	Stack<Integer> min = new Stack<>();
	
	void push (int x){
		
		if(aux.isEmpty()==true && min.isEmpty()==true){
			aux.push(x);
			min.push(x);
		}
		else{
			aux.push(x);
			int y=min.pop();
			min.push(y);
			if(x<y){
				min.push(x);
			}
			else{
				min.push(y);
			}
		}
	}
	
	public Integer pop(){
		//System.out.println("hi");
		int x = aux.pop();
		//System.out.println("bye");
		min.pop();
		return x;
	}
	
	public int getMin(){
		
		System.out.println("Scripped called");
		int x = min.pop();
		min.push(x);
		System.out.println("Min stack size"+min.size());
		return x;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackWithGetMin s = new stackWithGetMin();
		s.push(5);
		s.push(9);
		s.push(7);
		s.push(4);
		System.out.println(s.min.size());
		System.out.println("Min now "+s.getMin());
		
		
		s.pop();
		s.pop();
		s.pop();
		System.out.println("Min now "+s.getMin());
	}

}
