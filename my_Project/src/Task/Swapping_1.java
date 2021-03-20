package Task;

public class Swapping_1 {

	public static void main(String[] args) 
	{
		int arr[]= {5,6,7,8,9,0};
		System.out.println("entered array's element are: ");
		for (int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		for (int i=0;i<arr.length/2;i++)
		{
			int t=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=t;
		}

		System.out.println("after swapping: ");
		System.out.print("{");
		for (int i=0;i<arr.length;i++)
		{
		System.out.print(" "+arr[i]+" ");
		}
		System.out.print("}");
	}

}
