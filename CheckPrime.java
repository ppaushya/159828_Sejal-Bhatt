package Assignments;

import java.util.Scanner;

public class CheckPrime {

	public boolean isPrime(int n)
	{
		
		int flag=0;
			for(int j=2;j<n;j++)
			{
				if(n%j==0)
					{flag=1;
					break;
					}
			}
			if(flag==0)
			{
				return true;
			}
			else
				return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Prime Numbers less than 1000 are:");
		CheckPrime obj=new CheckPrime();
		for(int i=2;i<=1000;i++)
		{
			if(obj.isPrime(i))
				System.out.println(i);
		}
	}

}
