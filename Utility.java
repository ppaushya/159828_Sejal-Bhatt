package org.capg.util;

import java.util.Scanner;

public class Utility {
	
	
	
	public static int generateNumber()
	{
		return (int)(Math.random()*10);
	}

	public static String isValidName()	{
		Scanner sc=new Scanner(System.in);
		boolean flag=false;
		String name;
		do	{
			System.out.println(" name:");
			name=sc.next();
			flag=name.matches("[a-zA-Z]{3,}");
			if(flag==false)
			{
				System.out.println("Enter valid name!");
			}
		}	while(flag==false);
		return name;
	}
}
