package com.crackingthecode.Chapter1;

public class ctciQ6 {
	
	public static void main (String[] args){
		String name = "aabbcc";
		
		ctciQ6 m = new ctciQ6();
		System.out.println("Method1 "+ m.stringCompresser1(name));
		System.out.println("Method1 "+ m.stringCompresser2(name));
		
	}
	
	
	public static String stringCompresser1(String name)
	{
		int counter = 0;
		StringBuilder s = new StringBuilder(); //for beter memory thing
		
		for (int i = 0; i< name.length(); i++)
		{
			counter++;
			
			if (i+1>= name.length() || name.charAt(i)!= name.charAt(i+1))
			{
				s.append(name.charAt(i));
				s.append(counter);
				counter = 0;
			}
			
		}
		
		if (s.length()>name.length()){
			return name;
		}
		else
			return s.toString();
		
	}
	
	public static String stringCompresser2(String name)
	{
		
		String s = "";
		int counter = 0;
		
		for (int i = 0; i< name.length(); i++)
		{
			counter++;
			
			if (i+1>= name.length() || name.charAt(i)!= name.charAt(i+1))
			{
				s += "" + name.charAt(i) + counter;
				counter = 0;
			}
			
		}
		if (s.length()>name.length()){
			return name;
		}
		else
			return s;
	}

}
