package control_statment;

public class SwitchCaseStudy {

	public static void main(String[] args) 
	{
		//welcome to 1st yr engg
		//welcome to 2nd yr engg
		//welcome to 3rd yr engg
		//wellcome to 4th yr engg
		
		
		int year=4;
		
		switch (year) {
		case 1: System.out.println("Welcome to 1st year eengg");
			break;
		case 2: System.out.println("Welcome to 2nd year eengg");
		break;
		
		case 3: System.out.println("Welcome to 3rd year engg");
		break;
		case 4:System.out.println("Welcome to 4th year engg");
		break;

		default:System.out.println("Insert 1 to 4 degit only");
			break;
		}

	}

}
