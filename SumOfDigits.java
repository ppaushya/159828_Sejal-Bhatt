package Assignments;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		int n=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		n=sc.nextInt();
		int temp=0,sum=0;
		while(n>0)
		{
			temp=n%10;
			sum+=temp;
			n/=10;
		}
		System.out.println("Sum of digits of number is: "+sum);

	}

}
