package ConstructorStudy;

public class WithParameter 
{
	int a;
	int b;
	int c;
	
	public WithParameter() //user define constructor without parameter
	{
		a=10;
		b=20;
		c=30;
	}
	public WithParameter(int x) // user define with one parameter
	{
		a=x;
	}
	
	public WithParameter(int x, int y)//user define with 2 parameter
	{
		a=x;
		b=y;
	}
	
	public WithParameter(int x, int y, int z) // user define with 3 parameter
	{
		a=x;
		b=y;
		c=z;
		
	}

	public static void main(String[] args) {
		WithParameter wp= new WithParameter(); 
		wp.addition(); //calling method from zero parameter 
	
		
		WithParameter wp1= new WithParameter(140);
		wp1.addition();
		
		WithParameter wp2 = new WithParameter(50, 30);
		wp2.addition();
		
		WithParameter wp3 = new WithParameter(20, 30, 80);
		wp3.addition();

	}
	public void addition()
	{
		int sum=a+b+c;
		System.out.println("addition is "+sum);
	} 

}
