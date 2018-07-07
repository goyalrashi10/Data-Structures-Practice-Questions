package com.crackingthecode.Chapter1;
import java.util.*;

public class ctciQ7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=4, x = 4;
		int[][] m = new int[n][x];
		Random R=new Random(); 
		for (int i= 0 ; i <n ; i++)
		{
			for (int j= 0 ; j <x ; j++)
			{
				m[i][j]= R.nextInt(10);
				System.out.println("Before   "+m[i][j]);
			}
		}
		System.out.println(m.length);
		
		ctciQ7 h = new ctciQ7();
		h.rotate(m);
		for (int i= 0 ; i <n ; i++)
		{
			for (int j= 0 ; j <x ; j++)
			{
				System.out.println("After   "+m[i][j]);
			}
		}
		
		
	}
	
	public static boolean rotate (int[][] matrix)
	{
		if (matrix.length == 0 || matrix.length!= matrix[0].length)
			return false;
		
		int n = matrix.length;
		
		System.out.println("bbbbbb"+n);
		
		for (int layer = 0 ; layer <n/2 ; layer ++){
			int first = layer;
			int last = n-1-layer; // this is important because next time layer beech waali hogi matrix mei
			
			for (int i = layer; i <last; i++)
			{
				int offset = i-first;  //inka difference badhega to pointer b position change karega na
				int top = matrix[first][i];
				
				//left to top
				matrix[first][i]=matrix[last-offset][first];
				
				//bottom to left
				matrix[last-offset][first]=matrix[last][last-offset];
				
				//right to bottom
				matrix[last][last-offset]=matrix[i][last];
				
				//top to right
				matrix[i][last] = top;
			}
		}
		
		return true;
	}
}
