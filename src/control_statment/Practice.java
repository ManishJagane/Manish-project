package control_statment;

public class Practice {

	public static void main(String[] args) 
	{
		int mark=60;
		if (mark>=60 & mark<100) 
		{
			System.out.println("you are in dist");
			
		}
		else if (mark>=50 & mark<60) {
			System.out.println("You are in 1st class ");
		}
		else if (mark>=40 & mark<50) {
			System.out.println("you are pass");
		}
		else if (mark>100) {
			System.out.println("Invalid mark range");
		}
		else {
			System.out.println("you are fail");
		}
		

	}

}
