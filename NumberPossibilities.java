package Assignments;

import java.util.Scanner;

public class NumberPossibilities {
	int j=2;
	int k=1;
	int n;
	Scanner sc =new Scanner(System.in);
	String str;
	public void showSum(String str,int a)
	{
		
		for(int i=1;i<a;i++)
		{
			if(str=="")
			{
				System.out.print(str+ i+"+"+(a-i));
				System.out.println();
				if(a-i>1) {
					showSum(str+i,a-i);
				}
			}
			else
			{
				System.out.print(str+"+" +i+"+"+(a-i));
				System.out.println();
				if(a-i>1) {
					showSum(str+"+"+i,a-i);
				}
			}
		}
		
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberPossibilities obj=new NumberPossibilities();
		
		System.out.println("Enter the number:");
		obj.n=obj.sc.nextInt();
		
		obj.showSum("",obj.n);
		
	}
}
