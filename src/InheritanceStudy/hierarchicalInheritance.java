package InheritanceStudy;

public class hierarchicalInheritance {

	public static void main(String[] args) 
	{
		parents p1= new parents();
		p1.care();
		p1.goodwill();
		System.out.println("-----------------");

		
		//calling child1 class 
		child1 c1=new child1();
		c1.big();
		
		//calling parants class by usng child1  object
		c1.care();
		c1.goodwill();
		
		System.out.println("---------------------");
		//calling child2 class 
		child2 c2= new child2();
		c2.look();
		
		//calling parents class using child2 object
		c2.care();
		c2.goodwill();
	}

}
