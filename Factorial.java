package Assignments;

import java.util.Scanner;

public class Factorial {

	public void firstFactorial(int num)
	{
		int fact=1;
		for(int i=num;i>0;i--)
		{
			fact*=i;
		}
		System.out.println("The factorial is:\n"+fact);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		Factorial obj=new Factorial();
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the number:");
		n=sc.nextInt();
		obj.firstFactorial(n);
	}

}
