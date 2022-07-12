package AbstractStudy;

public class concretStudy extends AbstractClass
{

	public static void main(String[] args) 
	{
		concretStudy cs= new concretStudy();// create object of concrete class
		cs.test();//calling complete method from from abstractclass
		cs.test2();//method from concrete class
		AbstractClass.mymethod();// static method from abstact class
		method1();//static method from same class

	}
	@Override
	public void test2() 
	{
		System.out.println("this is ab. method complited in concrete class");
		
		
	}
	public void test3()
	{
		System.out.println("this is test3 mrthod ");
	}
	public static void method1()
	{
		System.out.println("this is static method from this class");
	}

}
