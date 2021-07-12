package Java_Gromming;

interface inter_1{
	
	//public static and final
	final int a= 10;
	
	//public and abstract
	void display();
}

//class implementing y=the interface
 class interface_abstract implements inter_1{
	 //implementation the method of interface
	 public void display() {
		 System.out.println("This is an implementation method");
	 }
	 
	 public static void main(String[] args) {
		 interface_abstract t = new interface_abstract();
		 //calling the implemented method by providing implementation on Class
		 //calling the variable driectly after implementing that class
		 t.display();
		 System.out.println(a);
	 }
}
