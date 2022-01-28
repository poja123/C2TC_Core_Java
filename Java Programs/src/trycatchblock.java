public class trycatchblock 
{
	public static void main(String[]args)
	{
		try
		{
			int data = 10/0;
			System.out.println("try block executes");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Can't divided by zero"); 
		}
		System.out.println("rest of the code");
	}

}
