package Assignments;

import java.util.Scanner;

public class LargestWord {

	public void longestWord(String s)
	{
		int len=0,max=0,init=0,last=0,init_new=0;
		
		char[] ch=new char[s.length()];
		char c='a';
		for(int i=0;i<s.length();i++)
		{
			ch[i]=s.charAt(i);
		}
		
		for(int i=0;i<s.length();i++)
		{
			//System.out.println("i="+i+" len="+len+" max="+max);
			if(ch[i]!=' ' && i!=(s.length()-1))
			{
				//System.out.println("1");
				len++;
			}
			else if(i==(s.length()-1))
			{
				//System.out.println("2");
				len++;
				if(len>max)
				{
					init=init_new;
					last=i;
					max=len;
					len=0;
				}
			}
			else
			{
				//System.out.println("3");
				if(len>max)
				{
					init=init_new;
					last=i;
					max=len;
					len=0;
				}
				init_new=i+1;
				len=0;
			}
		}
		//System.out.println("init="+init+" last="+last);
		char[] word=new char[(last-init)+1];
		
		for(int j=init,i=0;j<=last;j++,i++)
		{
			word[i]=ch[j];
		}
		System.out.println("The longest word in the string is: ");
		for(int i=0;i<word.length;i++)
			System.out.print(word[i]);
				
	}
	
	public static void main(String[] args)
	{
		String str;
		Scanner sc=new Scanner(System.in);
		LargestWord obj=new LargestWord();
		
		System.out.println("Enter a string:");
		str=sc.nextLine();
		obj.longestWord(str);
		
	}
	
}
