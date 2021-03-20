package raBi;

class anonymous_inner_1    // 1st class
{
	public void popcorn()   //1st method
	{
		System.out.println("salty");  // 1st input 
	}
}

class test1   // 2nd class
{
	public static void main(String[] args)
	{
		anonymous_inner_1 a1=new anonymous_inner_1()   //parent class---> child class
				{
			public void popcorn()
			{
				System.out.println("Spicy");     // we are override the method of parent class
			}    
				};
				a1.popcorn();
				
				anonymous_inner_1 a2=new anonymous_inner_1();   // we should go for anonymous when 
				a2.popcorn();                                // only one time that method functions only one time
				
				anonymous_inner_1 a3=new anonymous_inner_1()
						{
					public void popcorn()
					{
						System.out.println("sweet");
					}
						};
						a3.popcorn();
				
	}
} 