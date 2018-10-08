
import java.util.Scanner;

public class PossibilitiesQue {
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
		
		PossibilitiesQue p=new PossibilitiesQue();
		
		System.out.println("Enter the number:");
		p.n=p.sc.nextInt();
		
		p.showSum("",p.n);
		
	}
}