package logicalProgram;

public class reverseNumber {
	
	public static void main(String[] args)
	{
		int orgNum= 1225;
		int revNum=0;
		
		for(int i=orgNum; i>0;i=i/10)
		{
			int rem=i%10;
		revNum=revNum*10+rem;
		
		}
		System.out.println("Origginal number is "+orgNum);
		System.out.println("Reverse number is "+revNum);
		
	}

}
