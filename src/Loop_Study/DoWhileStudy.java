package Loop_Study;

public class DoWhileStudy {

	public static void main(String[] args) 
	{
		//This is Do while study 
		// if we want to print 2 s table
		
		int a=2;
		do {
			System.out.println(a);
			a=a+2;
			
		}
		while (a<=26);
		
		System.out.println("-----------------");
		
		// for reverse 
		int b= 20;
		do {
			System.out.println(b);
			b=b-2;
		} 
		while (b>=2);
		System.out.println("----------------");
		
		//print name 
		
		int c=1;
		do {
			System.out.println("MANISH");
			c++;
		} while (c<=7);
		
		int s=16;
		do {
			System.out.println(s);
			s=s+16;
		} while (s<=160);

}
}
