package MethodStudy;

public class methodypeStudy {

	public static void main(String[] args)
	{
	test(); //caling regular method from same class--->methodname() 
	sample(); ///caling regular method from same class
	MethodStudyClass.mymethod();// calling regular static method from diffrent class
	// ---> classname.methodname()
	MethodStudyClass.MyClass(); // calling regular static method from diffrent class
	// ---> classname.methodname()

	}
	public static void test() //<--regular-- static method
	{
		System.out.println("this is a regular statc method ");
		
	}
	public static void sample() {
		System.out.println("ths is sample of static method");
	}
	

}
