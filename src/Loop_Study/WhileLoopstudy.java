package Loop_Study;

public class WhileLoopstudy {

	public static void main(String[] args) 
	{
		// if u want to print 10s table
		//in while loop 
		//step 1 decleatation 
		int a= 10;
		//conditon 
		while (a<=100)
		{
			System.out.println(a);
			//updation 
			a=a+10;
		}
		System.out.println("----------------");
		
		//reverse 10th table
		
		//deecleatation 
		int b=100;
		while (b>=10) 
		{
			System.out.println(b);
			b=b-10;
			
		}
		System.out.println("------------------");
		
		//print name 5time
		int c=1;
		while (c<=5) 
		{
			System.out.println("MANISH");
			c=c+1;
			
		}
		System.out.println("-----------");

	}

}
