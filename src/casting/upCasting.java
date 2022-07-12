package casting;

public class upCasting {

	public static void main(String[] args) 
	{
		sonsClass s= new sonsClass();
		s.car();
		s.bike();
		s.money();
		
		fatharClass f=new sonsClass();// creating object of subclass and
		//giving superclass reference
		f.bike();// eligible for casting 
		f.car(); //eligible for casting
		//f.money(); //not eligible for casting 

	}

}
