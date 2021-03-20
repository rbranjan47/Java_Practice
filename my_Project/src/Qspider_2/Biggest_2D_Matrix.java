package Qspider_2;

public class Biggest_2D_Matrix 
{
    int[] columnWiseBiggest(int mat[][])
    {
    	int big[]=new int[mat[0].length];
    	
    	//number of columns
    	for (int i=0;i<mat[0].length;i++)
    	{
    		big[i]=mat[0][i];
    		
    		for(int j=1;j<mat.length;j++)
    		{
    			if(mat[j][i]>big[i])
    				big[i]=mat[j][i];
    		}
    	}
    	return big;
    }
	
	public static void main(String[] args) 
	{
		

	}

}
