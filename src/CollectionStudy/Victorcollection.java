package CollectionStudy;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Victorcollection {

	public static void main(String[] args) 
	{
		Vector v= new Vector<>();
		v.add("pune");
		v.add(10041);
		v.add(1221.112f);
		v.add("Nagpur");
		v.add(null);
		v.add(100);
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.contains("pune"));
		System.out.println(v.isEmpty());
		
		System.out.println("======================");
		//by using for loop 
		for(int i=0; i<=v.size()-1; i++)
		{
			System.out.println(v.get(i));
			
		}
		System.out.println("=================");
		//By using Iterator
		
		Iterator it = v.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("===============");
		
		// By using  listIterrator
		
		ListIterator ltr = v.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
			
		}
		System.out.println("-----------------");
		//BY using enumaration
		
		Enumeration en = v.elements();
		while(en.hasMoreElements())
		{
			System.out.println(en.nextElement());
			
		}
		System.out.println("-------------------");
		
		//by using for each loop
		for(Object x:v)
		{
			System.out.println(x);
		}
		
		

	}

}
