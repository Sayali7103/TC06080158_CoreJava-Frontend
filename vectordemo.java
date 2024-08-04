package Package;
import java.util.*;
public class vectordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector <Integer> V = new Vector<Integer>();
		
		for (int i=1; i<10;i++)
		{
			V.addElement(i);
		}
		System.out.println(V+"\n"+V.size()+"\n"+V.capacity());
		
		Enumeration <Integer> e = V.elements();
		while (e.hasMoreElements())
		{
			int i = e.nextElement();
			if (i%2==0)
			{
				System.out.println(i);
			}
		}
		System.out.println(V);
		Iterator<Integer> i = V.iterator();
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
		System.out.println(V);
		
	}

}
