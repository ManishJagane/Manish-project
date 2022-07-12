package ConstructorStudy;

public class UserDefineConstrucot {
	// variable declaration
	int a;
	int b;
	
	public UserDefineConstrucot()
	{
		// this is user define constructor
		//The constructor is called when am object is created
		// initialize variable / Assign value 
		a=200; 
		b=100;
	}

	public static void main(String[] args) {
		UserDefineConstrucot uc= new UserDefineConstrucot(); // object of class created
		uc.add();
		uc.sub();

	}
	public void add()
	{
		int sum= a+b; //value of a and b received from constructor
		System.out.println("Sum is "+ sum);
	
	}
	public void sub()
	{
		int sub= a-b; //value of a and b received from constructor
		System.out.println("sub is "+sub);
	}

}
