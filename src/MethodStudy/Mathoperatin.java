package MethodStudy;

public class Mathoperatin {

	public static void main(String[] args) 
	{
		// calling method from same class
		Mathoperatin mo = new Mathoperatin();
		mo.addition();// this is non static method from same class
		Mathoperatin.sub(); //This is static method from same class
		
		// Calling Methods from anather class
		MathOp math=new MathOp();// create object of anather class
		math.mult(); // calling non static method from anater class
		MathOp.div(); //calling static method from anther class
 
	}
	
	public void addition() // non-static method 
	{
		int a= 80;
		int b = 70;
		int sum= a+b;
		System.out.println("Sum is "+ sum);
	}
	public static void sub() // static method from same clss
	{
		int a= 400;
		int b= 300;
		int subs= a-b;
		System.out.println("Sub is "+ subs );
	}
	

}
