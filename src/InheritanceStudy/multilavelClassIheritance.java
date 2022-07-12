package InheritanceStudy;

public class multilavelClassIheritance {

	public static void main(String[] args) 
	{
		//calling grandfather property 
		grandfather gf= new grandfather();
		gf.experiance();
		gf.old();
		
		System.out.println("------------------");
		//calling fathers property by father's object
		father f= new father();
		f.money();
		f.car();

		//calling grandfathers property by using father's object 
		f.experiance();
		f.old();
		
		System.out.println("--------------------");
		//now calling daughter's property by using object
		daughter d= new daughter();
		d.mobile();
		d.scoody();
		
		//calling fathers property by using daughter's object
		d.car();
		d.money();
		
		//calling grandfather's property by using daughter's object 
		d.experiance();
		d.old();
		System.out.println("-----------------");

	}

}
