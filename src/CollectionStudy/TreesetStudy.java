package CollectionStudy;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetStudy {

	public static void main(String[] args) 
	{
		TreeSet ts= new TreeSet<>();
		
		ts.add("Rohit");
		ts.add("virat");
		ts.add("rishabh");
		ts.add("sehvag");
		ts.add("dhoni");
		ts.add("yuvraj");
		//ts.add(null); // null value gives nullPointerException
		ts.add("yuvraj"); // duplicate not allowed
		//ts.add(12);   // only allowed homogeneous value ,, it gives ClassCAstExcepton
		
		
		System.out.println(ts);
		System.out.println(ts.size());
		System.out.println(ts.contains("yuvraj"));
		
		
		System.out.println("=============");
		//by using for loop 
		
		for(int i=0; i<= ts.size()-1; i++)
		{
			System.out.println(ts);
			
		}
		System.out.println("---------------------");
		// ffor each loop 
		
		for(Object lm:ts)
		{
			System.out.println(lm);
		}
		
		System.out.println("-------------------");
		
		// by using iterator
		
		Iterator it = ts.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		 
		

	}

}
