package ArrayStudy;

import java.util.Arrays;

public class ArrayStudy {

	public static void main(String[] args) 
	{
		int num[]= {4,2,3,1,6,5};// 1.+2.declaration + initialization
		
		//3. usage 
		for(int i=0; i<=num.length-1; i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("====================");
		
		//lets see how to sort given array 
		//we need to use sort method of string
		
		Arrays.sort(num);
		for(int i=0; i<= num.length-1;i++)
		{
			System.out.println(num[i]);
		}
		System.out.println("======================");
		
		Arrays.sort(num);
		
		for(int i= num.length-1; i>=0; i--)
		{
			System.out.println(num[i]);
		}

	}

}
