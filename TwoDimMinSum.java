import java.util.Scanner;

public class TwoDimMinSum {

	Scanner sc=new Scanner(System.in);
	int[][] arr;
	
	
	public void getElements(int r, int c)
	{
		arr=new int[r][c];
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("Enter row "+i+" column "+j+" element:");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix is:");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void getMinSum(int r, int c)
	{
		System.out.println("The row with minimum sum:");
		int minRow=0,sum=0, minSum=1000000000;
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				sum+=arr[i][j];
				//System.out.println("sum:"+sum);
			}
			if(sum<minSum)
			{	minSum=sum;
			//System.out.println("minsum:"+minSum);
			minRow=i;
			}
			sum=0;
		}
		for(int i=0;i<c;i++)
			System.out.print(arr[minRow][i]+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
		TwoDimMinSum obj=new TwoDimMinSum();
		
		System.out.println("Enter number of rows:");
		m=obj.sc.nextInt();
		System.out.println("Enter number of columns:");
		n=obj.sc.nextInt();
		obj.getElements(m,n);
		obj.getMinSum(m,n);
	}

}
