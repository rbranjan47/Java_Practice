package Java_Gromming;

public class max_array {
	public static void main(String[] args) {
		int[] arr = {10,30,40,15,55};
		
		int smallest = Integer.MAX_VALUE;
		
		
		for(int i=0; i<arr.length;i++)
		{
			if(smallest>arr[i]) {
				smallest = arr[i];
			}
		}
		System.out.println(smallest);
	}
}
