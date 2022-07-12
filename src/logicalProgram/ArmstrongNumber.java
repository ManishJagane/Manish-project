package logicalProgram;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) 
	{
		//123--> 1^3+ 2^3+3^3= 1+8+27=36  --> not armstrong no. 
		//153--> !^3+5^3+3^3= 1+125+7  -->it is Armstrong no.
		Scanner sc=new Scanner(System.in);
		System.out.println("Entter number-");
		int num=sc.nextInt();
		int num1=0;
		
		for(int i=num; i>0; i=i/10)
		{
			int rem=i%10;
			
			num1=num1+(rem*rem*rem);
			
		}
		if(num==num1)
		{
			System.out.println("Given number  "+num+ " is Armstrong Number");
		}
		else {
			System.out.println("Given number "+num+" is not an Armstrong number");
		}

	}

}
