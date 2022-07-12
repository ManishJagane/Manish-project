package ArrayStudy;

public class SplitMethod {

	public static void main(String[] args) 
	{
		String a="MJ MOTORCORP ENGINEERING WORK INDIA LTD";
		String[] op= a.split(" ");
	
		//System.out.println(op);
		 
		//it used only when we used LOOP
		
		for(int i=0; i<=op.length-1; i++)
			
		{
			System.out.println(op[i]);
		}
		
		System.out.println("================");
		for(int i=  op.length-1; i>=0; i--)
		{
			System.out.println(op[i]);
		}

		
	}

}
