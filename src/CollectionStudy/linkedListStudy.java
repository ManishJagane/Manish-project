package CollectionStudy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedListStudy {

	public static void main(String[] args) 
	{
		LinkedList ll= new LinkedList<>();
		ll.add("Manish");
		ll.add(1211);
		ll.add(133.23);
		ll.add(true);
		ll.add(null);
		ll.add("Manish");
		ll.add(null);
		ll.add(121);
		
		System.out.println(ll);
		System.out.println(ll.size());
		System.out.println(ll.contains(1211));
		System.out.println(ll.get(2));
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		System.out.println(ll.peek());// peek mean retrieve but it does not remove from list
		System.out.println(ll);
		System.out.println(ll.peekLast());
		System.out.println(ll.poll()); // it retrieve and remove from the list
		System.out.println(ll);
		System.out.println(ll.pollLast()); // last value is retrieve and remove;
		System.out.println(ll);
		System.out.println(ll.pop());
		System.out.println(ll);
		//System.out.println(ll.push(123));
		
		System.out.println("=================");
		// BY USING FOR LOOP
		for(int i= 0; i<=ll.size()-1; i++)
		
		{
			System.out.println(ll.get(i));
		}
		
		
		System.out.println("=================");
		// by using iterator 
		
		Iterator m = ll.iterator();
		
		while(m.hasNext())
		{
			System.out.println(m.next());
			
		}
		
		System.out.println("===============");
		ListIterator ltr = ll.listIterator();
		while(ltr.hasNext())
		{
			System.out.println(ltr.next());
		}
		
		System.out.println("--------------------");
		
		
		//by using for each loop
		for(Object n:ll)
		{
			System.out.println(n);
		}
		

	}

}
