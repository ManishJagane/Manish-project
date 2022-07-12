package logicalProgram;

import java.util.Arrays;

public class compareArrey {

	public static void main(String[] args) 
	{
		int ar1[]= {10,50,30};
		int ar2[]= {20,30,50};
		int ar3[]= {10,50,30};
		
		System.out.println(Arrays.equals(ar2, ar1));
		
		System.out.println(Arrays.equals(ar2, ar3));
		System.out.println(Arrays.equals(ar1, ar3));

	}

}
