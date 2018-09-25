package Assignments;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int n=0;                                                                                                                                                                                                                         
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		n=sc.nextInt();
		int a=1,b=1;
		int j=0;
		while(a<n && b<n)
			{j=0;
				while(j<3)
					{
					if(a%2==1)
						{System.out.print(a+" ");
						j++;}
					a++;
					if(a>=n)
						break;}
		
			j=0;
			
				while(j<3)
					{
					if(b%2==0)
						{System.out.print(b+" ");
						j++;}
					b++;
					if(b>=n)
						break;}
			}
		
	}}


