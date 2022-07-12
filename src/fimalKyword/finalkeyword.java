package fimalKyword;

public class finalkeyword 
{
	int a=20;
	final int b=50;

	public static void main(String[] args) 
	{
		finalkeyword f= new finalkeyword();
		f.add();
		f.add1();

	}
	public void add()
	{
		int sum=a+b;
		System.out.println("addtion "+ sum);
	}
	public void add1()
	{
		a=a+10;
		System.out.println("add " + a);
		//b=b+13;
		System.out.println("add " + b);
	}
	

}
  