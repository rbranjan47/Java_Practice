//rotate the given matrix into 90 left of Right
//LOGIC ----
// After Transpose, 90* reverse column wise------90* left reverse
// After Transpose, 90* reverse row wise------90* right reverse
package Qspider_2;

public class Rotate_matric_Ninty
{

	int [][] rotate90Left(int mat[][])
	{
		mat=transpose(mat);
		columnwisereverse(mat);
		return mat;
	}
	 int[][] transpose(int[][] mat) 
	 {
		 return null;             //fill it neccessary items
	}
	int [][] rotate90Right(int mat[][])
	{
		mat=transpose(mat);
		rowwisewisereverse(mat);
		return mat;
	}
	
	void columnwisereverse( int mat[][])
	{
		
	}
	
	void rowwisewisereverse(int mat[][])
	{
		
	}
	public static void main(String[] args) 
	{
		

	}

}
