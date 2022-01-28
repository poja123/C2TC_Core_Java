import java.util.Scanner;
public class NestedifelseStatements 
{
	public static void main(String[]args)
	{
	 char chr;
	Scanner sc1 = new Scanner(System.in);
	System.out.print("Enter Character= ");
	chr = sc1.next().charAt(0);
	if( chr >= 'A' && chr <= 'Z')
	{
		if(chr == 'A' || chr == 'E' || chr == 'I' || chr == 'O' || chr == 'U' )
		{
			System.out.println("Printed Character is Upper Case Vowel");
		}
		else
		{
			System.out.println("Printed Character is Upper case consonant");
		}
	
	}
	else if( chr >= 'a' && chr <= 'z')
	{
		if(chr == 'a' || chr == 'e' || chr == 'i' || chr == 'o' || chr == 'u' )
		{
			System.out.println("Printed Character is Lower Case Vowel");
		}
		else
		{
			System.out.println("Printed Character is Lower case consonant");
		}
		
		
	}
	else if( chr >= '0' && chr <= '9')
	{
		System.out.println("Printed Character is Number Character");	
	}
	else
	{
		System.out.println("Printed Character is Special Character");
	}
	
	
	}

}
