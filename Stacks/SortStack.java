package com.crackingthecode.Stacks;
import java.util.*;

public class SortStack {
	
	//Stack<Integer> s = new Stack<>();
	
	void sortI(Stack<Integer>s){
		Stack<Integer> r = new Stack<>();
		while(s.isEmpty()!=true){
			int temp = s.pop();
			
			while(r.isEmpty()!=true && r.peek()<temp){
					s.push(r.pop());
			}
			
			r.push(temp);
		}
		
		while(r.isEmpty()!=true){
			s.push(r.pop());
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> s = new Stack<>();
		SortStack q = new SortStack();
		s.push(5);
		s.push(9);
		s.push(6);
		s.push(12);
		s.push(3);
		s.push(20);
		
//		while(s.isEmpty()!=true){
//			System.out.println(s.pop());
//		}
		q.sortI(s);
		System.out.println("After sorting");
		while(s.isEmpty()!=true){
			System.out.println(s.pop());
		}

	}

}
