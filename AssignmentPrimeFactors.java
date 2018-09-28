package Assignments;

import java.util.Scanner;

public class AssignmentPrimeFactors {

	Scanner sc=new Scanner(System.in);
	int n;
	
	public void getNum()
		{
			n=sc.nextInt();
		}
	
	public static void main(String[] args) {
		AssignmentPrimeFactors p=new AssignmentPrimeFactors();
		System.out.println("Enter the number");p.getNum();
		System.out.println("Following are prime factors of "+p.n);
		int num=p.n;
		for(int i=2;i<(p.n);i++)
		{
			while(num%i==0)
			{
				System.out.print(i+" ");
				num=num/i;
			}
		}
	}
}


