package Qspider_2;

public class Spiral_Matrix 
{
	void sprialMatrix(int mt[][])
	{
		 for(int i=0,j=mt.length-1;i<j;i++,j--)
		    {
			for(int k=i;k<j;k++)
				System.out.print(mt[i][k]+" ");
			
			for(int k=i;k<j;k++)
				System.out.print(mt[k][j]+" ");

			for(int k=j;k>i;k--)
				System.out.print(mt[j][k]+" ");
			
			for(int k=j;k>i;k--)
				System.out.print(mt[k][i]+" ");
		   }


		if(mt.length%2==1)
		 System.out.print(mt[mt.length/2][mt.length/2]);
	}
	public static void main(String[] args)
	{
		
	}

}
