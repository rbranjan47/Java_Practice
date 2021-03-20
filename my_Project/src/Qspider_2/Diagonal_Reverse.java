package Qspider_2;

public class Diagonal_Reverse 
{

	void diagonalWiseReverse(int mat[][])
	{
		for(int i=0;i<mat.length/2;i++)
		{
			for(int j=0;j<mat[i].length;j++)
			{
				if (i==j)  //swapping primary element
				{
					int temp=mat[i][j];
					mat[i][j]=mat[mat.length-1-i][mat.length-1-i];
					mat[mat.length-1-i][mat.length-1-i]=temp;
				}
				if (i+j==mat.length-1) //swapping secondary element
				{
					int temp=mat[i][j];
					mat[i][j]=mat[j][i];
					mat[j][i]=temp;
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		

	}

}
