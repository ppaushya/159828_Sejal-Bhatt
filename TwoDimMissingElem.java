import java.util.Scanner;

public class TwoDimMissingElem {
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
	
	public int[] minMissingElem(int r, int c)
	{
		int[] result=new int[r];
			int x=0,flag=0;
			for(int k=0;k<r;k++)
			{
				flag=0;
				for(int i=1;i<c;i++)
				{
				if(arr[k][i]-arr[k][i-1]>1)
					{
					x=i-1;
					//System.out.println("pos:"+k+" "+x);
					result[k]=arr[k][x]+1;
					flag=1;
					break;
					}
			}
			if(flag==1)
					continue;
			result[k]=arr[k][c-1]+1;
			}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
		TwoDimMissingElem obj=new TwoDimMissingElem();
		
		System.out.println("Enter number of rows:");
		m=obj.sc.nextInt();
		System.out.println("Enter number of columns:");
		n=obj.sc.nextInt();
		obj.getElements(m,n);
		System.out.println("The minimum missing elements are:");
		for(int i=0;i<obj.minMissingElem(m,n).length;i++)
			System.out.print(obj.minMissingElem(m,n)[i]+" ");
	}

}
