import java.util.Scanner;

public class AddMultiplyMatrix {

	Scanner sc=new Scanner(System.in);
	int[][] arr1;
	int[][] arr2;
	public void getElements1(int size)
	{
		
		arr1=new int[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.println("Enter row "+i+" column "+j+" element for array 1:");
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("The 1st matrix is:");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void getElements2(int size)
	{
		
		arr2=new int[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.println("Enter row "+i+" column "+j+" element for array 2:");
				arr2[i][j]=sc.nextInt();
			}
		}
		System.out.println("The 2nd matrix is:");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(arr2[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	
	public void sumMatrix(int size)
	{
		int[][] sumArr=new int[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				sumArr[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
		System.out.println("The summation matrix is:");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(sumArr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void multiplyMatrix(int size)
	{
		int[][] prodArr=new int[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				for(int k=0;k<size;k++)
				{prodArr[i][j]+=(arr1[i][k]*arr2[k][j]);}
			}
		}
		System.out.println("The product matrix is:");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(prodArr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		AddMultiplyMatrix obj=new AddMultiplyMatrix();
		
		System.out.println("Enter number of rows/columns:");
		n=obj.sc.nextInt();
		obj.getElements1(n);
		obj.getElements2(n);
		obj.sumMatrix(n);
		obj.multiplyMatrix(n);
	}

}
