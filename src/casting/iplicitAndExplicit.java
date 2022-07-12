package casting;

public class iplicitAndExplicit {

	public static void main(String[] args) 
	{
		//ex. of implicit casting of widing casting
		int a=100; //Lower type of data type
		System.out.println(a);
		
		//converting into higher type of data type 
		double b=a;
		System.out.println(b);
		
		byte c=102;
		System.out.println(c);
		
		//converting into higher type of data type 
		float d=c;
		System.out.println(d);
		
		System.out.println("---------------------");
		
		//Ex. of explicit casting 
		
		double x=189.5578; //higher type of data
		System.out.println(x);
		
		//converrting into lower type 
		int y= (int) x;
		System.out.println(y);
		
		float f= 12.233422f;
		System.out.println(f);
		
		short s=(short) f;
		System.out.println(s);

	}

}
