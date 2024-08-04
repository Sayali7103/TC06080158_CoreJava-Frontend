package Package;

import java.beans.Statement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class testtt {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		FileOutputStream foi = new FileOutputStream("c://abc.txt");
		ObjectOutputStream ois = new ObjectOutputStream(foi);
		
		
		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c://abc.txt"));
//		Statement s = (Statement)ois.readObject();
//		System.out.println(s);
	}

}
