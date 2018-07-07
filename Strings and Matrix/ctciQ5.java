package com.crackingthecode.Chapter1;

public class ctciQ5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "paile";
		String s2 = "pile";
		ctciQ5 m = new ctciQ5();
		
		//solution1
//		if (s1.length()== s2.length())
//		{
//			System.out.println("Replace  "+m.replaceOne(s1,s2));
//		}
//		else if(s1.length()+1 == s2.length())
//		{
//			System.out.println("Edit + 1  "+m.insertRemoveEdit(s1,s2));
//		}
//		else if(s1.length()-1 == s2.length())
//		{
//			System.out.println("Edit - 1  "+m.insertRemoveEdit(s2,s1));
//		}
//		
		//solution 2
		System.out.println("Combined "+m.combined(s2,s1));
		

	}
	boolean replaceOne(String s1, String s2){
		Boolean flag = false;
		
		for(int i = 0; i< s1.length(); i++){
			System.out.println("Inside for"+i);
			System.out.println("s1 i "+s1.charAt(i));
			System.out.println("s2 i "+s2.charAt(i));
			if(s1.charAt(i)!=s2.charAt(i)){
				System.out.println("flag @35"+flag);
				if (flag==true){
					System.out.println("Flag @#37  "+flag);
					return false;
				}
				flag = true;
			}
		}
		
		return true;
	}
	
	boolean insertRemoveEdit(String s1, String s2){
		
		int index1 = 0;
		int index2 = 0;
		
		while (index2 < s2.length()&&index1 < s1.length())
		{
			System.out.println("Index1 in while   "+index1);
			System.out.println("Index2 in while   "+index2);
			if(s1.charAt(index1)!= s2.charAt(index2))
			{
				System.out.println("Index1 in if 1   "+index1);
				System.out.println("Index2 in if 1   "+index2);
				if(index1!=index2){
					System.out.println("**Inside small if**   ");
					return false;
				}
				index2++;
				
			}else
			{
				index1++;
				index2++;
			}
		}
		return true;
	}
		
	
	boolean combined(String s1, String s2){ //not producing correct result -- have to check--i dont also understand
		String p1, p2;
		int index1 = 0, index2 = 0;
		boolean flag = false;
		
		if (s1.length()-s2.length() > 1){
			System.out.println("hi");
			return false;
		}
		
		if (s1.length()>s2.length()){
			 p1 = s1;
			 p2 = s2;
		}
		else{
			 p2 = s1;
			 p1 = s2;
		}
		System.out.println("p1: "+ p1+" p2 :"+p2);
		
		while(index2< s2.length()&& index1 < s1.length())
		{
			if(s1.charAt(index1) != s2.charAt(index2))
			{
				if (flag == true)
				{
					return false;
				}
				flag = true;
				if (p1.length() == p2.length())
				{
					index1++;
				}
			}else {
				index1++;
			}
			index2++;
		}
		
		
		return true;
	}

}
