package com.crackingthecode.Chapter1;

public class ctciQ9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "Rashi";
		String s2 = "ashir";
		
		ctciQ9 yo = new ctciQ9();
		if (yo.checkRotation(s1, s2)){
			System.out.println("Yes!");
		}
		else
		{
			System.out.println("no!");
		}

	}
	
	boolean checkRotation( String s1, String s2){
		
		String s1s1 = "";
		if (s1.length()== s2.length() && s1.length()> 0){
			s1s1 = s1+s1;
		}
		
		if (s1s1.contains(s2))
			return true;
		
		return false;
	}

}
