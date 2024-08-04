package Package;

import java.io.Serializable;

public class serializations implements Serializable,Cloneable {
	private int rollno;
	private String name;
	private transient float fees;
	
	public serializations() {}
	
	public serializations (int rollno, String name, float fees)
	{
		super();
		this.rollno = rollno;
		this.name= name;
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "serializations [rollno=" + rollno + ", name=" + name + ", fees=" + fees + "]";
	}
	
	
	

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		// persisting state object is known as serialization
//System.out.println("thi");
		serializations s = new serializations(2,"jfj,",(float) 1200.34);
		serializations s1 = (serializations)s.clone();
		System.out.println(s1);
		
	}

}
