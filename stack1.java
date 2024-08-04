package Package;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class stack1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push(20);
		s.push(40);
		s.push(89);
		s.push(7);
		
		System.out.println(s);
//		System.out.println(s.empty());
//		System.out.println(s.peek());
//		System.out.println(s.search("A"));
//		System.out.println(s.search(20));
//		s.pop();
//		System.out.println(s);
//		s.push(3939);
//		System.out.println(s);
		
		ListIterator<Integer > ll = s.listIterator();
		while (ll.hasNext())
		{
			Integer ws = ll.next();
			if (ws.equals(7))
			{
				ll.set(700);
			}
			if (ws.equals(89))
			{
				ll.set(800);
			}
			if (ws.equals(40))
			{
				ll.set(400);
			}
			
		}
		System.out.println(s);
		while (ll.hasPrevious())
		{
			Integer ws = ll.previous();
			if (ws.equals(700))
			{
				ll.set(7000);
			}
			if (ws.equals(800))
			{
				ll.set(8000);
			}
			if (ws.equals(400))
			{
				ll.set(4000);
			}
			
		}
		System.out.println(s);
		
		// using enumerator we can only display 
		Enumeration  e = s.elements();
		while (e.hasMoreElements())
		{
			int i = (int) e.nextElement();
			if (i%2==0)
			{
				System.out.println(i);
			}
		}
		// isomg iterator we can add or remove elemnrts form collectois
		Iterator<Integer> i = s.iterator();
		while (i.hasNext())
		{
			int n = i.next();
			if (n%2==0)
			{
				System.out.println(n);
			}
			else
			{
				i.remove();
			}
		}
		System.out.println(s);

	}

}
