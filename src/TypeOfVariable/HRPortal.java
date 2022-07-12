package TypeOfVariable;

public class HRPortal {

	public static void main(String[] args) 
	{
		// creating object from anather class
		Employee st= new Employee();
		st.name="Pravin Thakur";
		st.emp_dep="Maintanance";
		st.emp_id=2111;
		st.emp_sal=20000.00f;
		st.emp_grade='A';
		
		Employee mj= new Employee();
		mj.name="Manish";
		mj.emp_dep="Production";
		mj.emp_id=2112;
		mj.emp_sal=20000.24f;
		mj.emp_grade='A';
		
		st.emp_info();
		mj.emp_info();
				

	}

}
