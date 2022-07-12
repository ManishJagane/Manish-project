package CollectionStudy;

import java.util.HashSet;
import java.util.Iterator;

public class SetStudy {

	public static void main(String[] args) 
	{
		// HashSet-->
		
		// doesn't allow duplicate 
		//allow only 1 null value 
		// random insertion
		
		HashSet hs= new HashSet<>();
		hs.add("pune");
		hs.add("pune");
		hs.add(null);
		hs.add(null);
		hs.add(1234);
		hs.add(12.21);
		hs.add(true);
		hs.add('A');
		
		
		System.out.println(hs);
		System.out.println(hs.contains(12.12));
		System.out.println(hs.size());
		System.out.println(hs.clone());
		System.out.println(hs.contains(1234));
		System.out.println(hs.contains(12));
		System.out.println(hs.equals("pune"));
		System.out.println(hs.hashCode());
		System.out.println(hs.remove(12.21));
		//System.out.println(hs);
		//System.out.println(hs.removeAll(hs));
		//System.out.println(hs.retainAll(hs));
		//System.out.println(hs);
		
		System.out.println("======================");
//		for(int i=0;i<=hs.size()-1; i++)
//		{
//			System.out.println(hs);
//		}
		 System.out.println("================");
		 
		 // by using iterator
		 Iterator it = hs.iterator();
		 
		 while(it.hasNext())
		 {
			 System.out.println(it.next());
		 }
		 
		 System.out.println("---------------------");
		  
		 //by using for each loop
		 for(Object itr:hs)
		 {
			 System.out.println(itr);
		 }
		 

	}

}
