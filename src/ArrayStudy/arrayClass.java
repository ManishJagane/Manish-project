package ArrayStudy;

public class arrayClass {

	public static void main(String[] args) 
 	{
		// if we want assign memory to Array
		//1.array declaration
		char grade[]= new char[7];
		
		//Initialization of array 
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		grade[4]='E';
		grade[5]='F';
		grade[6]='H';
		
		
		//3. Usage
		System.out.println(grade[0]);
		System.out.println(grade[1]);
		System.out.println(grade[2]);
		System.out.println(grade[3]);
		System.out.println(grade[4]);
		System.out.println(grade[5]);
		System.out.println(grade[6]);
		
		System.out.println("==========================");
		
		for(int i=0; i<=6; i++)// Static coding
		{
			System.out.println(grade[i]);
			
		}
		System.out.println("==========================");
		
		for(int i=0; i<=grade.length-1;i++)// dynamic coding
		{
			System.out.println(grade[i]);
		}
		System.out.println("============================");
		
		for(int i=grade.length-1; i>=0;i--)
		{
			System.out.println(grade[i]);
		}
	}

}
