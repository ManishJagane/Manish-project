package MethodStudy;

public class PuneUniversity {

	public static void main(String[] args) {

		PuneUniversity PU = new PuneUniversity();
		PU.studantinfo();
		PU.Studantinfo("Pravin", "PU10002", "B.tech", 3, 'A');
		PU.Studantinfo("Rahul", "PU10003", "B.com", 2, 'B');
		PU.Studantinfo("Vikrant", "PU10004", "B.pharm", 2, 'C');
	}
	public void studantinfo() //non static method// without parameter
	{
		// name, PRN, course, year, grade 
		String name = "Manish";
		String PRN = "true";
		String course= "B.tech";
		int year= 3;
		char grade= 'A';
		
		System.out.println("==========================");
		System.out.println("Studant name is " + name);
		System.out.println("Studant PNR is  " + PRN);
		System.out.println("Studand year is "+ year );
		System.out.println("studant course is "+ course);
		System.out.println("Studant grade is "+ grade);
		System.out.println("===========================");
	}
	
	public void Studantinfo(String name,String PRN,String course,int year, char grade)
	{
		System.out.println("==========================");
		System.out.println("Studant name is " + name);
		System.out.println("Studant PNR is  " + PRN);
		System.out.println("Studand year is "+ year );
		System.out.println("Studant grade is "+ grade);
		System.out.println("===========================");
	}

}
