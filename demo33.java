package exception_handling;

public class demo33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			int a,b,c=0;
			a = Integer.parseInt(args[0]);
			b = Integer.parseInt(args[1]);
			c=a/b;
			
			System.out.println("Div = "+c);
			
		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("Denomoinater should not be Zero");
//			
//		}
//		catch (ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("Enter at least one parameter");
//		}
//		catch (NumberFormatException e)
//		{
//			System.out.println("Enter integer only");
//		}
		catch
		(Exception e)
		{
			if (e instanceof ArithmeticException)
			{
				System.out.println("Denominator should not be Zero");
			}
			else if (e instanceof ArrayIndexOutOfBoundsException)
			{
				System.out.println("Enter at leaast one element");
			}
			else if (e instanceof NumberFormatException)
			{
				System.out.println("Enter integer only");
			}
			else
			{
				System.out.println("Exception is Handled");
			}
				
			//e.printStackTrace();
		}
	}
}
