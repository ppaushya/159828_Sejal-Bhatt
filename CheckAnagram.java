package Assignments;

import java.util.Scanner;

public class CheckAnagram {
	
	public boolean checkAnagram(String s1, String s2)
	{
		char[] ch1=new char[s1.length()];
		char[] ch2=new char[s2.length()];
		int flag=0;
		
		for(int i=0;i<s1.length();i++)
		{
			ch1[i]=s1.charAt(i);
		}
		for(int i=0;i<s2.length();i++)
		{
			ch2[i]=s2.charAt(i);
		}
		
		if(s1.length()==s2.length())
		{
			for(int i=0;i<s1.length();i++)
			{
				for(int j=0;j<s2.length();j++)
				{
					if(ch1[i]==ch2[j])
						{flag=1;
						break;}
					else 
						flag=0;
					if(j==(s2.length()-1) && flag==0)
						return false;
				}
			}
			return true;
		}
		else 
			return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		CheckAnagram obj=new CheckAnagram();
		
		System.out.println("Enter first string:");
		str1=sc.nextLine();
		System.out.println("Enter second string:");
		str2=sc.nextLine();
		
			System.out.println(obj.checkAnagram(str1,str2));
	}

}
