package polymorphism;

public class MethodOverloading {

	public static void main(String[] args) 
	{
		//method overloading is declearing same method in class with same method name but diff. parameter 
		//method overloading is an example of compile time polymorphism
		MethodOverloading m= new MethodOverloading();
		m.add();
		m.add(10, 20);
		m.add(10, 20, 80);
		m.add(42, 5.343f);

	}
	 
	public void add()
	{
		int a=20;
		int b=40;
		int sum=a+b;
		System.out.println("addition is " + sum);
		
	}
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("addition is "+sum);
	}
	public void add(int a,int b,int c)
	{
		int x= a+b-c;
		System.out.println("value is " + x);
		
	}
	
	public void add(int a, float b)
	{
		float z= a+b;
		System.out.println("addition float is " + z);
		
	}
	

}
