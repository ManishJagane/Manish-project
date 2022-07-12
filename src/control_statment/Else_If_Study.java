package control_statment;

public class Else_If_Study {

	public static void main(String[] args) 
	{
		//if mark>=60---->you are in dist
		//else if mark>=50--- 1st class
		//else if mark>=40 ---pass
		//else you fail 
		                        
		
		int marks=28;
		if (marks>=75) {
			System.out.println("you are in dist");
		}
		else if(marks>=50)
		{
			System.out.println("you are in 1st class");
		}
		else if (marks>=40) {
			System.out.println("you are pass");
			
		}
		else {
			System.out.println("you are fail");
		}

	}

}
