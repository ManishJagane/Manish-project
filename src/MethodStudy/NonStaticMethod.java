package MethodStudy;

public class NonStaticMethod {

	public static void main(String[] args)
	{
		//to creating object  syntax-->
		// className objectName= new className
		// to calling non static method in same class
		// objectName.methodName();
		
		NonStaticMethod obj = new NonStaticMethod();
		
		obj.display(); //calling non static method using object from same class
		
		NonStaticStudy myclass= new NonStaticStudy();
		myclass.runnng(); // calling non static method using object from diffrent class
		

	}
	public void display()
	{
		System.out.println("This is Non static method in same class");
	}

}
