package com.crackingthecode.Stacks;

public class stackUsingArrays {
	
	public static final int max = 1000;
	int top;
	int a[] = new int[max];
	
	boolean isEmpty(){
		return (top<0);
	}
	 
	stackUsingArrays(){
		top = -1;
	}
	
	boolean push(int x){
		if(top>=max){
			System.out.println("Stack overflow");
			return false;
		}
		else
		{
			a[++top]=x;
			return true;
		}
	}
	
	int pop(){
		if(top<0){
			System.out.println("Stack underflow");
			return 0;
		}
		else{
			//System.out.println(top);
			int x=a[top--];
			//System.out.println(top);
			return x;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stackUsingArrays s = new stackUsingArrays();
		s.push(5);
		s.push(10);
		s.push(15);
		System.out.print(s.pop());
		

	}

}
