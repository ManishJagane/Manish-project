package TypeOfVariable;

public class Employee 
{
	// name, id, sal grade 
	String name;
	int emp_id;
	String emp_dep;
	float emp_sal;
	char emp_grade;
	
	
	public void emp_info()
	{
		System.out.println("----------------------------------");
		System.out.println("Employee name is "+name);
		System.out.println("Employee id is "+emp_id);
		System.out.println("Employee dept is "+ emp_dep);
		System.out.println("Employee Salary is "+ emp_sal);
		System.out.println("Employee grade is "+ emp_grade);
		System.out.println("----------------------------------");
	}

}
