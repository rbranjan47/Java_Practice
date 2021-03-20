package raBi;

class anonymous_inner 
{
	public void college()
	{
		System.out.println("trident academy of technology");
	}
}
class name
{
	public static void main(String[] args)
	{
		anonymous_inner a1=new anonymous_inner()
				{
			public void college()
			 {
				 System.out.println("Trident Academy of Tchnology, BBSR");
			 }
				};
				a1.college();
				
				anonymous_inner a2=new anonymous_inner();
						a2.college();
				
				anonymous_inner a3=new anonymous_inner()
						{
					public void college()
					{
						System.out.println("KIIT");
					}
						};
						a3.college();
	}
}
