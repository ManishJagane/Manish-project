package AccessSpecifier;

public class privateStudy {

	public static void main(String[] args) 
	{
		privateStudy ps= new privateStudy();
		ps.test1(); //calling private method from same class
		ps.test2(); //calling default method from same class
		ps.test3(); //calling protected method from same class
		ps.test4();//calling protected method from same class
		

	}
	private void test1()
	{
		System.out.println("i am private method test1");
	}
	void test2()
	{
		System.out.println("i am default method test2");
	}
	protected void test3()
	{
		System.out.println("i am protcted method test3");
	}
	public void test4()
	{
		System.out.println("i am public method test4");
	}

}
