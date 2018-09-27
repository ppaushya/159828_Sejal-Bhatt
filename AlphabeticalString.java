package Assignments;

import java.util.Scanner;

public class AlphabeticalString {

	public char[] AlphabetSoup(String s)
	{
		char[] ch=new char[s.length()];
		char c='a';
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
		}
		
		
		for(int i=0;i<ch.length-1;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]>ch[j])
				{
					c=ch[i];
					ch[i]=ch[j];
					ch[j]=c;
				}
			}
		}
		return ch;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc=new Scanner(System.in);
		AlphabeticalString obj=new AlphabeticalString();
		
		System.out.println("Enter a word:");
		str=sc.nextLine();
		System.out.println("String after modification: ");
		for(int i=0;i<str.length();i++)
			System.out.print(obj.AlphabetSoup(str)[i]);
	}

}
