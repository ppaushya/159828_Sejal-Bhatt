package Assignments;

import java.util.Scanner;

public class CapitalLetter {
	
	public char[] letterCapitalize(String s)
	{
		char[] c=new char[s.length()];
		
		for(int i=0;i<s.length();i++)
		{
			c[i]=s.charAt(i);
		}
		
		for(int i=0;i<c.length;i++)
		{
			if(i==0)
				{
				c[0]=(char)((int)c[0]-32);
				}
			else if(c[i-1]==' ')
			{
				c[i]=(char)((int)c[i]-32);
			}
			else if(c[i]==' ' && c[i+1]==' ')
			{
				System.out.println("Enter valid data");
				c=null;
				return c;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		
		Scanner sc=new Scanner(System.in);
		CapitalLetter obj=new CapitalLetter();
		
		System.out.println("Enter a string with single spaces:");
		str=sc.nextLine();
		
		
		System.out.println("String after modification: ");
		if(obj.letterCapitalize(str)!=null)
		{
			for(int i=0;i<str.length();i++)
					System.out.print(obj.letterCapitalize(str)[i]);
		}
			
	}

}
