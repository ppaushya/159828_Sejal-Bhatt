package Assignments;

import java.util.Scanner;

public class ChangeLetters {

	public char[] letterChanges(String s)
	{
		char[] ch=new char[s.length()];
		char c='a';
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
		}
		
		for(int i=0;i<s.length();i++)
			{
				ch[i]=(char)((int)ch[i]+1);
				if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
					ch[i]=(char)((int)ch[i]-32);
			}
		
		return ch;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc=new Scanner(System.in);
		ChangeLetters obj=new ChangeLetters();
		
		System.out.println("Enter a string:");
		str=sc.nextLine();
		System.out.println("String after changing letters and capitalizing vowels: ");
		for(int i=0;i<str.length();i++)
			System.out.print(obj.letterChanges(str)[i]);
	}

}
