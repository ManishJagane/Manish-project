package AbstractStudy;

public abstract class AbstractClass {

	public static void main(String[] args) 
	{
		//AbstractClass ab= new AbstractClass();
		mymethod();

	}
	public void test()
	{
		System.out.println("this is normal test method ");
	}
	
	public static void mymethod()
	{
		System.out.println("this is static method");
	}
	public abstract void test2();
	

}
