package CollectionStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrraylistCollection {

	public static void main(String[] args) 
	{
		ArrayList a=new ArrayList<>();
		a.add("velocity");
		a.add(121);
		a.add('A');
		a.add(121);
		a.add(true);
		a.add(125.215547);
		a.add(null); 
		a.add("velocity");
		a.add(null);
		
		System.out.println(a);
		System.out.println(a.size());
		System.out.println(a.isEmpty());
		System.out.println(a.indexOf('A'));
		System.out.println(a.lastIndexOf("velocity"));
		System.out.println(a.get(3));
		System.out.println(a.contains(121));
		System.out.println(a.remove(7));
		System.out.println(a);
		
		for(int i =0; i <=a.size()-1; i++)
		{
			System.out.println(a.get(i));
			
		}
		System.out.println("==========");
		//by usimg iterator
		
		Iterator it = a.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("==================");
		
		// by using listIterator
		ListIterator ltr = a.listIterator();
		
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
			
//			System.out.println(ltr.previous());
		}
		
		System.out.println("==================");
		//By using for each loop
		
		for(Object m:a)
		{
			System.out.println(m);
		}

		

	}

}
