package Assignments;

public class CheckArmstrong {

	public boolean isArmstrong(int n)
	{
		int temp=0,sum=0;
		int m=n;
		while(m>0)
		{
			temp=m%10;
			sum+=(temp*temp*temp);
			m/=10;
		}
		if(sum==n)
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("The Armstrong numbers less than 1000 are:");
		CheckArmstrong obj = new CheckArmstrong();
		for(int i=1;i<=1000;i++)
		{
			if(obj.isArmstrong(i))
				System.out.println(i);
		}
	}

}
