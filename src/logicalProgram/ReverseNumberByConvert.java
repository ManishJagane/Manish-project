package logicalProgram;

import java.util.Scanner;

public class ReverseNumberByConvert {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number-->");
		int orgNum=sc.nextInt();
		String orgString = Integer.toString(orgNum);
		String revString="";
		
		for(int i=orgString.length()-1;i>=0; i--)
		{
			revString=revString+orgString.charAt(i);
		}
		int revNum = Integer.parseInt(revString);
		System.out.println("Original number is "+orgNum);
		System.out.println("Reverse number is "+revNum);
		
		

	}

}
