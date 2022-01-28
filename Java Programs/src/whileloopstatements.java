// loop is used to execute block of code repeatedly

//while loop when we dont know range it checks condn if it only validates thn only execute
public class whileloopstatements
{
	public static void main(String[]args)
	{
		int i=0;
		while(i<=5)
		{
			System.out.println(i);
			i++;
		}
		
		
		System.out.println("=================================");
		
		
		//program to separate entered digit using while loop
		
		long n = 1234657889L;
		while(n!=0)
		{
			long d = n%10;
			System.out.println(d);;
			n=n/10;
		}
		
		System.out.println("=================================");
		
		
		//dowhile loop  - it will execute atleast once either is condn satisfies or not
		
		int m=5;
		do
		{
			System.out.println(m);
			m--;
		}while(m>=1);
		
		System.out.println("=================================");
		
		
		
		int t = 0;    
		System.out.println("Printing the list of first 10 even numbers \n");    
		do
		{    System.out.println(t);    
		t =  t + 2;    
		}
		while(t<=10);    
		   
		
		
	}
	

}
