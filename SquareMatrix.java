import java.util.Scanner;

public class SquareMatrix {
	Scanner sc=new Scanner(System.in);
	int[][] arr;
	public void getElements(int size)
	{
		arr=new int[size][size];
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.println("Enter row "+i+" column "+j+" element:");
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("The matrix is:");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void firstDiagonal(int size)
	{
		System.out.println("The first diagonal is:");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(arr[i][j]+" ");
				if(i==j)
				{
					System.out.println();
					break;
				}
			}
			
		}
	}
	
	public void secondDiagonal(int size)
	{
		System.out.println("The second diagonal is:");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				if(i<=j)
				{
					System.out.print(arr[i][j]+" ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
	public void printTranspose(int size)
	{
		System.out.println("The transpose is:");
		for(int i=0;i<size;i++)
		{
			for(int j=0;j<size;j++)
			{
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		SquareMatrix obj=new SquareMatrix();
		
		System.out.println("Enter number of rows/columns:");
		n=obj.sc.nextInt();
		obj.getElements(n);
		obj.firstDiagonal(n);
		obj.secondDiagonal(n);
		obj.printTranspose(n);
	}

}
