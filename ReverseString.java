package Assignments;

import java.util.Scanner;

public class ReverseString {

	public char[] ReverseOrder(String s)
	{
		char[] ch=new char[s.length()];
		char c='a';
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
		}
		
		
		for(int i=0,j=ch.length-1;i<ch.length/2;i++,j--)
		{
			
					c=ch[i];
					ch[i]=ch[j];
					ch[j]=c;
			
		}
		return ch;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc=new Scanner(System.in);
		ReverseString obj=new ReverseString();
		
		System.out.println("Enter a string:");
		str=sc.nextLine();
		System.out.println("String after reversing: ");
		for(int i=0;i<str.length();i++)
			System.out.print(obj.ReverseOrder(str)[i]);
	}

}
