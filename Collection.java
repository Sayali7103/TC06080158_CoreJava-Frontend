package Package;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

//import java.util.List;

class test{
	int i;
}

public class Collection {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
/* Array - fixed size, only homogenous data-type, it can hold both primitive and object type
 * Legacy classes - these are the clases that procide suport to the collection interface
 * all legacy clases are synchronous
 * collection framework - enumrTION(I) / dicitonary (AC)/ VEctor C/ stack C/ Hash Table c/ properties C
 * collection - collection can hold both homogenous and non-homogenous data, memory-recommended, 
 * performance-notrecommended, colection ca hold only object but not rpimitives
 * 
 * # collection framework - it provide an architectuer to store and amnipulate object
 * defference between vectors and arrays
 * 
 * aArrayList -
 * insertionorder is preserved, duplicats are aloowed, index palys very imprrtatn role in list
 * the underlying datastrucutre is resizable array or growable arraY
 * 
 * converting preimitive to wrapper class using depricated- boxing
 * converting wrapper class to primitive using depricated- unboxing
 * 
 * converting preimitive to wrapper class - auto boxing
 * converting wrapper class to primitive - auto unboxing
 *
 * */
	List<Integer> l=new ArrayList<Integer>();
	l.add(10);
	l.add(10);
//		test t;
//		System.out.println(t.i);
//		
	l.add(34);
	l.add(33);
//	l.add(null);
	l.add(40);
	l.add(30);
	System.out.println(l);
	l.add(2,56);
	System.out.println(l);
	l.remove(1);
	System.out.println();
	
	System.out.println(l.contains(100));
	List l1=Collections.synchronizedList(l);
	
	Iterator<Integer> i = l.iterator();
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
	System.out.println(l);

	}

}
