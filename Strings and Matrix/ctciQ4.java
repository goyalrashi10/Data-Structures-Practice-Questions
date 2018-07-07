package com.crackingthecode.Chapter1;

public class ctciQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "tactcoa";
		
		ctciQ4 m = new ctciQ4();
		m.checkPermPal1(name);
		
		if (m.checkPermPal1(name))
		{
			System.out.println("Yes!");
		}
		else
		{
			System.out.println("Noooooo!");
		}

	}
	
	Boolean checkPermPal1(String s) //this is my method -- it is considering every character but it should consider alphabets
	{
		
		char[] chr = s.toCharArray();
		int[] letters= new int[128];
		
		int countForOne = 0;
		
		for (char c: chr)
		{
			
			letters[c]++;
		
		}
		
		for (int j = 0 ; j <128;j++)
		{
			int d = letters[j]%2;
			//System.out.println("letters   "+letters[j]);
			if (d==1)
			{
				countForOne++;
			}

		}
		
		//System.out.println("count for 1  " +countForOne);
		if ( countForOne != 1)
		{
			return false;
		}
		
//		my stupid logic which is also true btw!!
//		else
//		{
//			for (int i = 0 ; i < 128; i++)
//			{
//				int a = letters[i]%2;
//				//System.out.println(a);
//				if(a != 0)
//				{
//					return false;
//				}
//				else
//				{
//					return true;
//				}
//			}
//		}
		
		return true;
	}

}
