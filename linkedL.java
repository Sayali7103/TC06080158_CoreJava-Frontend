package Package;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;

public class linkedL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.add("Mayuri");
		l.add(20);
		l.add(null);
		l.add(true);
		
		System.out.println(l);
		
		l.set(0, "rahul");
		System.out.println(l);
		
		l.removeLast();
		System.out.println(l);
		
		l.addFirst(40);
		System.out.println(l);
		
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
		System.out.println(l instanceof RandomAccess);
		
		

	}

}
