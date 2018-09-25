package Assignments;

import java.util.Scanner;
import java.lang.String;
public class StringFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the string:");
		str=sc.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<=i;j++)
				System.out.print(str.charAt(j));
			System.out.println();
		}
	}
}
