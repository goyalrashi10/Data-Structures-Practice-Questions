package com.crackingthecode.Chapter1;

import java.util.Random;

public class ctciQ8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=4, m = 4;
		int[][] matrix = new int[n][m];
		Random R=new Random(); 
		for (int i= 0 ; i <n ; i++)
		{
			for (int j= 0 ; j <m ; j++)
			{
				matrix[i][j]= R.nextInt(10);
				System.out.print("   "+matrix[i][j]);
			}
			System.out.println("  ");
		}
		System.out.println("_____________  ");
		
		ctciQ8 h = new ctciQ8();
		h.zeroMat(matrix,n,m);
		for (int i= 0 ; i <n ; i++)
		{
			for (int j= 0 ; j <m ; j++)
			{
				System.out.print("   "+matrix[i][j]);
			}
			System.out.println("  ");
		}
	}

	public static void zeroMat(int[][] matrix, int k, int l) //written only one solution coz second solution is stupid
	{
		boolean[] zeroRow = new boolean[matrix.length];
		boolean[] zeroCol = new boolean[matrix[0].length];
		
		
		for (int i= 0 ; i <matrix.length ; i++)
		{
			for (int j= 0 ; j <matrix[0].length ; j++)
			{
				System.out.print("   "+matrix[i][j]);
			}
			System.out.println(" / ");
		}
		
		for (int i =0 ; i <k ; i++)
		{
			for (int j= 0 ; j<l; j++)
			{
				//System.out.println("Inside  for "+i+","+j+"Matrix value:"+matrix[i][j]);
				if (matrix[i][j] == 0)
				{
					//System.out.println("Inside  "+i+","+j+"Matrix value:"+matrix[i][j]);
					zeroRow[i]=true;
					zeroCol[j]=true;
				}
			}
		}
		
			for(int i1 =0 ; i1 <matrix.length ; i1++){
				//System.out.println("zero row check  "+zeroRow[i1]);
				if(zeroRow[i1]==true){
					zerofyRow(matrix, i1);
				}
			}
			for(int j1 =0 ; j1 <matrix[0].length ; j1++){
				//System.out.println("zero col check  "+zeroCol[j1]);
				if(zeroCol[j1]==true){
					zerofyCol(matrix, j1);
				}
			}
		}	
	public static void zerofyRow(int[][] matrix, int i){
		
		for (int j = 0; j <matrix[0].length ; j++)
		{
			matrix[i][j] = 0;
		}
		
	}
public static void zerofyCol(int[][] matrix, int j){
		
		for (int i = 0; i <matrix.length ; i++)
		{
			matrix[i][j] = 0;
		}
		
	}
	
	
}
