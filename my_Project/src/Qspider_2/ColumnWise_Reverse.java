package Qspider_2;

public class ColumnWise_Reverse 
{

	void ColumnWiseReverse(int mat[][])
	{

		for(int i=0;i<mat.length/2;i++)
		{
		  for(int j=0;j<mat[i].length;j++)
		  {
			int t=mat[i][j];
			mat[i][j]=mat[mat.length-1-i][j];
			mat[mat.length-1-i][j]=t;
			
		  }
		}

		}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

	}

}
