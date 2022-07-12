package logicalProgram;

import java.util.Scanner;

public class EvenddNumber {

	public static void main(String[] args)
	{
		// num/2 remainder --> 0 Even 
		// num/2 remainder ==> 1 odd no.
		
//		System.out.println(10/2);
//		System.out.println(10%2);
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number -");

		int a = sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println("Given number is EVEN number");
		}
		else {
			System.out.println("Given Number is ODD Number");
		}
		
		
	}

}
