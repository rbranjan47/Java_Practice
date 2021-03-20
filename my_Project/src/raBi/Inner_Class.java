package raBi;

class Inner_Class 
{
	class  sub_inner
	{
		public void show()
		{
			System.out.println("this is inner class");
		}
	}

	public static void main(String[] args) 
	{
		
		System.out.println("this is outer class");
		Inner_Class.sub_inner in=new Inner_Class().new sub_inner();
		in.show();

	}

}
