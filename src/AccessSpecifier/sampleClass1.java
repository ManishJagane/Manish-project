package AccessSpecifier;

public class sampleClass1 {

	public static void main(String[] args) 
	{
		privateStudy ps1= new privateStudy();
		//ps1.test1(); // calling private method from anather class
		ps1.test2();// calling default metthod from anather class
		ps1.test3();// calling protected method from anather class
		ps1.test4();//calling public method from anather class

	}

}
