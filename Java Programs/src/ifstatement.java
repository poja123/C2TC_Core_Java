//if statement is used to execute conditions the o/p of if statement execution will be boolean (true/false)
import java.util.Scanner;
public class ifstatement 
{
public static void main(String[] args)
{
	//if else
	int x = 10;  
	int y = 12;  
	if(x-y > 10)
	{  
	System.out.println("x - y is greater than 10");  
	}   
	else 
	{  
	System.out.println("x - y is lesser than 10"); 
	}
	
	//if else if 
	double percent = 93.8;
	Scanner sc1 = new Scanner(System.in);
	System.out.println("Enter Scored Percentage= ");
	percent = sc1.nextDouble();
	
		
		if(percent > 90)
		{  
		System.out.println("Congratulation your grade is A scored percent is " + percent);  
		}
		else if (percent > 75) 
		{  
		System.out.println("Congratulation your grade is B scored percent is " + percent);  
		}
		else if ( percent > 60)
		{  
		System.out.println("Congratulation your grade is C scored percent is " + percent);  
		}
		else
		{
			System.out.println("Congratulation your grade is D scored percent is " + percent);
		}
		

}
}
