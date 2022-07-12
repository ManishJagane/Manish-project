package ArrayStudy;

public class excersice2 {

	public static void main(String[] args) 
	{
		//with using new keyword 
		String name[]= new String[4];
		name[0]="Manish";
		name[1]="Ashish";
		name[2]="Pravin";
		name[3]="Akash"; 
		for(int i=0; i<=name.length-1; i++)
		{
			for(int j= 0; j<=name.length-1; j++)
			{	
			System.out.print(name[i]+"  ");
			}
			System.out.println();
			
		}
		System.out.println("========================");
		
		String[] a= {"Manish","Pravin ","Shubham" };
		
		for(int i=0; i<=a.length-1;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("=========================");
		
		//Float 
		
		float parcent[]= {60.54f,58.32f,68.22f,55.23f, 87.22f };
		
		for(int i= 0; i<=parcent.length-1; i++)
		{
			System.out.println(parcent[i]);
		}
		
		System.out.println("======================");
		
		
		
		
		
		
		
		

	}

}
