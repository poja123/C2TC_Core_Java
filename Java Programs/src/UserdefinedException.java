
import java.util.Scanner;
public class UserdefinedException
{
	public static void main(String[]args) throws NotPossible
	{
		
				System.out.print("Enter Money= ");
				Scanner cash = new Scanner(System.in);
				long money = cash.nextInt();
				if (money < 500)
				{
					throw new NotPossible("Please enter the money more than 500");
				}
				else
				{
					System.out.println("Its retrieving,Wait for seconds");
				}
		
	}
}
class NotPossible extends Exception
{
	NotPossible (String msg)
	{
		super(msg);
	}
	
}