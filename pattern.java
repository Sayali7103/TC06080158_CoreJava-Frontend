package loop_statements;
import java.util.Scanner;
public class pattern {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("enter the number : ");
		int n = ip.nextInt();
		 for (int i=n;i>=1;i--)
		 {
			 for (int j=i;j>=1;j--)
			 {
				 System.out.print("* ");
			 }
			 System.out.println(" ");
		 }

	}

}
