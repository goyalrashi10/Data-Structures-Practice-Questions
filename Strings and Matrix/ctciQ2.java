package com.crackingthecode.Chapter1;

import java.util.*;

public class ctciQ2 {

	public static void main(String[] args) {
		// first method explained by book... exactly same.. sorting and using equal functions from java
		String a = "Rasah";
		String b = "Rhaas";
		
		ctciQ2 h = new ctciQ2();
		//calling method 1
		if (h.checkPermutation1(a,b))
			System.out.println("Using checkPermutation1, string is a match ");
		else
			System.out.println("Using checkPermutation1, string is not a match ");
		
		//calling method 2
//		if (h.checkPermutation2(a,b))
//			System.out.println("Using checkPermutation2, string is a match ");
//		else
//			System.out.println("Using checkPermutation2, string is not a match ");
//		
		//calling method 3
		if (h.checkPermutation3(a,b))
			System.out.println("Using checkPermutation3, string is a match ");
		else
			System.out.println("Using checkPermutation3, string is not a match ");
		

	}

	public String manualSort(String a){
	
		char[] chr = a.toCharArray();
		Arrays.sort(chr);
		return new String(chr);
		
		
	}
		
	
	public Boolean checkPermutation1(String a, String b) {
		// using arrays as hash tables.. our own method
		
		return manualSort(a).equals(manualSort(b));
	}
	
	public Boolean checkPermutation2(String a, String b){ // -- wrong solution -- repeated letters not taken into account
		
		int[] chr1= new int[128];
		int[] chr2= new int[128];
		
		if (a.length()!=b.length()) return false;
		
		for(int i=0; i< a.length(); i++){
			int valA=a.charAt(i);
			int valB=b.charAt(i);
			
			System.out.println("valA : "+valA+" valB : "+valB);
			
			chr1[valA]=valA;
			chr2[valB]=valB;
			
		}
		
		for(int i=0; i< 128; i++){
			
			//System.out.println("valA : "+chr1[i]+" valB : "+chr2[i]);
			if (chr1[i]!=chr2[i]){
				return false;
				
			}
		}
		return true;
		
	}
	
//	public Boolean checkPermutation3(String a, String b){
//		
//		int[] chr1= new int[128];
//		
//		if (a.length()!=b.length()) 
//			return false;
//		
//		for(int i=0; i< a.length(); i++){
//			int valA=a.charAt(i);
//			int valB=b.charAt(i);
//			
//			chr1[valA]++;
//			chr1[valB]--;
//		}
//		
//		for(int i=0; i< 128; i++){
//			
//			System.out.println("valA : "+chr1[i]);
//			if (chr1[i]< 0) 
//				return false;
//				
//			}
//		
//		return true;
//	}
	
	public Boolean checkPermutation3(String a, String b){
		int[] chr = new int[128];
		if (a.length()!=b.length()) 
		return false;
		
		char[] a_to_chr = a.toCharArray();
		for(char c:a_to_chr){
			chr[c]++;
		}
		
		for (int i=0; i<b.length(); i++){
			int val = b.charAt(i);
			chr[val]--;
			
			if(chr[val]< 0)
				return false;
		}
		
		return true;
	}
}

//my 1st approach 
//if(a.length()!=b.length())
//	return false;
//
//Boolean[] flag = new Boolean[a.length()];
//for (int i = 0 ; i< a.length(); i++)
//{
//	for (int j = 0; j< b.length(); j++)
//	{
//		int valA = a.charAt(i);
//		int valB = b.charAt(j);
//		System.out.println("valA"+valA+" valB : "+valB);
//
//		if ( valA == valB)
//		{
//			flag[i]= true;
//			break;
//		}
//		else
//		{
//			flag[i]=false;
//		}
//		//System.out.println("valA"+valA+" valB : "+valB+" flag :"+flag[i]);
//	}
//}
//for (int i = 0 ; i< a.length(); i++)
//{ 
//	System.out.println(" flag :"+flag[i]);
//	if (flag[i]!=true)
//		return false;
//}
//
//
//return true;
//}