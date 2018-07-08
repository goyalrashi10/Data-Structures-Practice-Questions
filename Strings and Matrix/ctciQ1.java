package com.crackingthecode.Chapter1;

public class ctciQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "RRashi";
		ctciQ1 h = new ctciQ1();
		if (h.slowCheck(s))
		{
			System.out.println ("Slow - It is a unique String");
		}
		else
			System.out.println ("Slow - It is not a unique String");
		
		h.smartCheck(s);
		if (h.smartCheck(s))
		{
			System.out.println ("smart - It is not a unique String");
		}
		else
			System.out.println ("smart - It is a unique String");
		

	}


	public boolean slowCheck(String s) //my own solution --O(n^2)
	{
		//char[] c = s.toCharArray();
		//int val = s.charAt(0);
		//char c1 = s.charAt(0);
		//System.out.println(val+" "+c1+" "+c[0]+" ");
		
		for (int i =0; i< s.length(); i++)
		{
			for(int j = i+1; j < s.length(); j++)
			{
				
				if(s.charAt(i)==s.charAt(j))
				{
					return false;
				}
				//System.out.println(s.charAt(i));
			}
		}
		return true;
	}
	
	
	public boolean smartCheck(String s) // book solution -- using additional DS -- O(n)
	{
		
		if (s.length() > 65000)
			return false;
		
		boolean[] a= new boolean[65000];
		
		for (int i=0;i<s.length(); i++)
		{
			int val = s.charAt(i);
			if (a[val] == true)
			{
				return false;
			}
		}
		return true;
	}
}
	
