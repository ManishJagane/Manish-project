package thisAndSuper;

public class thisStudy 
{ 
	//this keyword is useedto access global variable from same/current class
	
	int a= 10;
	static int b=20;

	public static void main(String[] args) 
	{
		thisStudy ts= new thisStudy();
		ts.sampel();
		ts.sample2();
		
		

	}
	public void sampel()
	{
		int a= 100;
		System.out.println("local vslue of a is "+ a);
		System.out.println("global value of a is "+this.a);
	}
	public void sample2()
	{
		int a= 120;
		int add1= a+1;
		int add2= this.a+1;
		
		System.out.println("add1 local a is " +add1);
		System.out.println("add2 glosbsl a is "+ add2);
	}

}
