package ArrayStudy;

public class MultiDimensionalArray2 {

	public static void main(String[] args) 
	{
		String name[][]= {{"One","Two","Three"},{"four","five","six"}};
		
		for(int i=0; i<=1; i++)
		{
			for(int j=0; j<=2; j++)
			{
				System.out.print(name[i][j]+"   ");
			}
			System.out.println();
		}
		
		System.out.println("=============================");
		
		char call[][]= {{'A','B','C'},{'D','E','F'},{'G','H','I' },{'J','K','L'} };
		
		for(int i=0; i<=call.length-1;i++)
		{
			for(int j= 0; j<=i;j++)
			{
				System.out.print(call[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println("=========================");
		
		boolean truth[][]= {{true, false},{false, true}};
		
		for(int i=0; i<=1;i++)
		{
			for(int j=0; j<=1; j++)
			{
				System.out.print(truth[i][j]+"   ");
				
			}
			System.out.println();
		}
		
		System.out.println("======================");
		 
		char value[][]= {{'A','B','C'},{'A','B','C'},{'A','B','C'}};
		
		for(int i=0; i<=value.length-1; i++)
		{
			for(int j=0; j<=i; j++)
			{
				System.out.print(value[i][j]+" ");
			}
			System.out.println();
		}
		
		
		

	}

}
