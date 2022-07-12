package control_statment;

public class AccountInfo {

	public static void main(String[] args) 
	{
		//if UN valid ----> enter PWD
		//if PWD is valid ---.>login success
		//else PWD is invalid ---. imcorrect pWD
		//else UN is invalid ---. incorrect UN
		
		
		String UN="ManishJ";
		String PWD= "Manish@1234";
		
		if (UN=="ManishJ") {
			System.out.println("Enter password");
			if (PWD=="Manish@1234") {
				System.out.println("Login success");
			}
			else {
				System.out.println("Incorrect Password");			}
		}
		else {
			System.out.println("Incorrect User Name");
		}

	}

}
