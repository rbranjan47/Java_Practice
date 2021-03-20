package Qspider_2;

public class Swap_Matrix 
{

	void rowWiseReverse(int mat[][])
	{
		for (int i=0;i<mat.length;i++)
		{
			for(int j=0;j<mat[i].length/2;j++)
			{
				int temp=mat[i][j];
				mat[i][j]=mat[i][mat[i].length-1-j];
				mat[i][mat[i].length-1-j]=temp;
			}
		}
	}
	public static void main(String[] args) 
	{
		

	}

}
