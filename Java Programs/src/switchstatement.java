import java.util.Scanner;
public class switchstatement
{
	public static void main(String[]args)
	{
		
	int x=10;
	int y=76;
	switch(y)
	{
	case 45:
		System.out.println(60);
		
	case 76:
		System.out.print(20);
		
	default:
		System.out.println(40);  // as break is not mentioned all cases will execute which is below the executed case
		
	}
	
	
	
	//with the use of scanner class nd break 
	Scanner sc1 = new Scanner(System.in);
	System.out.print("Enter the Key= ");
	x = sc1.nextInt();
	switch(x)
	{
	case 0:
		System.out.println( " English ");
		break;
	case 1:
		System.out.println( "Hindi ");
		break;
	case 2:
		System.out.println( " Marathi");
		break;
	default:
		System.out.println("Entered Wrong Key, Please Try Again");
	
		
	}
	
	}

	

}
