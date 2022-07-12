package TypeOfVariable;

public class GlobalAndLocal 
{
	static int a=40; //global static variable 
	int b= 10; // global non static variable

	public static void main(String[] args) 
	{
		System.out.println("Value of a is "+ a);
		
		// to called non static global variable \
		//we have to  create object
		GlobalAndLocal gl = new GlobalAndLocal(); //create object same class for non static method 
		System.out.println("the value of b is "+ gl.b);// calling non static global variable from same class 
		gl.addition();// calling method from same class 
		gl.sub();// calling non static method from same class
		
		//calliing to static method from anather class
		System.out.println(" vallue of static global variable from anather classs is "+ test1.y );
		
		// to calling non static veriable from anather class
		//create object forr anather class
		test1 t1= new test1();
		System.out.println("value of non static global variable from anather class "+ t1.z);
		

	}
	public void addition()
	{
		int x= 20;
		int sum= x+ 10;// x is local variable knwn to addition method only 
		int sum1= a+ 1000;// a is gloabal variable known to whole class
	System.out.println(x+ sum+ sum1);
	}
	public void sub()
	{
		int p = 120;
		int sub1 = b-p;
		//int sub2= x-p; // x is a local variable of anather method 
		System.out.println("sub is "+ sub1);
		
	}
	

}
