package CollectionStudy;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class linkedhashsetStudy {

	public static void main(String[] args) 
	{
		//linkedhashset doesn't allow duplicate
		//1 null value allow
		// O.I. maintained
		LinkedHashSet ls = new LinkedHashSet<>();
		ls.add("nagpur");
		ls.add(121);
		ls.add("nagpur");
		ls.add('A');
		ls.add(true);
		ls.add(null);
		ls.add(null);
		ls.add(12.33);
		ls.add("manish");
		
		System.out.println(ls);
		System.out.println(ls.size());;
		System.out.println(ls.contains("manish"));
		System.out.println(ls.clone());
		
		
		for (int i= 0; i<=ls.size()-1; i++)
		{
			System.out.println(ls);
			
		}
		
		System.out.println("-----------------");
		// by using iterator 
		
		 Iterator lhs = ls.iterator();
		 while(lhs.hasNext())
		 {
			 System.out.println(lhs.next());
		 }
		 
		 System.out.println("---------------------");
		 //for each 
		 for(Object ll:ls)
		 {
			 System.out.println(ll);
		 }
		 
		 
		 
		
		

	}

}
