package com.crackingthecode.Chapter1;

public class ctciQ3 {
	
	public static void main(String[] args){
		
		String name = "Hello Rashi  ";
		int trueLength = 11;
		char[] chr = name.toCharArray();
		ctciQ3 m = new ctciQ3();
		m.checkURLify (chr,trueLength);
		
		
	}
	
	void checkURLify(char[] chr, int trueLength){
		
		int spaceCount = 0;
		for(int i =0; i < trueLength;i++){
			if(chr[i]== ' ')
				spaceCount++;
			
		}
		System.out.println("Space" + spaceCount);
		int index= trueLength + (spaceCount*2);
		
		System.out.println("index"+index);
		
		//if (index != chr.length) -- don't know how to implement it
		
		for(int i = trueLength - 1; i>=0; i--){
			if (chr[i] == ' ')
			{
				chr[index -1]='_';
				chr[index -2]='_';
				chr[index -3]='_';
				index = index-3;
			}
			else
			{
				chr[index - 1]= chr[i];
				index--;
			}
			//System.out.println(chr);
		}
		
		System.out.println(chr);
			
			
	}
	
}
