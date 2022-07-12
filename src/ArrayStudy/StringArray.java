package ArrayStudy;

public class StringArray {

	public static void main(String[] args) 
	{
		String name[]= new String[5];
		
		name[0]= "Manish";
		name[1]="Ishwar";
		name[2]= "Sonu";
		
		for(int i=0; i<=name.length-1;i++)
		{
			System.out.println(name[i]);
		}
		
		System.out.println("=====================");
		
		for(int i=name.length-1; i>=0;i--)
		{
			System.out.println(name[i]);
		}
	}

}
