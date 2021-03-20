//transpose is also possible without creating new matrix, for which it must be square matrix
//01----10, 02---20, 03----30, 04----40...., 12-----21,  13-----31,......
package Qspider_2;

public class Transpose_Square_matrix
{
 void transpose(int mat[][])
 {
	 for (int i=0;i<mat.length;i++)
	 {
		 for (int j=0;j<mat[i].length;j++)
		 {
			 int t=mat[i][j];
			 mat[i][j]=mat[j][i];
			 mat[j][i]=t;
		 }
	 }
 }
	public static void main(String[] args)
	{
		
	}

}
