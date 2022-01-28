// for looop is used whne range is given
//Syntax- for(initialization, condition, increment/decrement)
public class forstatementloops 
{
	public static void main(String[]args)
	{
	int i=0;
	for (int j=1;j<=10;j++)
	{
		i = j+1;
		System.out.println(i);
	}
	
	
	System.out.println("=================================");
	
	//
	
	int k=0;
	for (System.out.println("Hello World"); k<3; System.out.println("Hii Eclipse"))
	{
		k++;
	}
	
	System.out.println("=================================");
	System.out.println("=================================");
	
	
//for-each loop- its a enhanced version and it is best for retrieving 
//Syntax - for(data_type var : array_name/collection_name)
	
	
	String[] list = {"Sugar","Salt","Milk","Eggs","Bread"};
	System.out.println("Printing the content of the list");
	for ( String names:list)
	{
		System.out.println(names);
	}
	
	}

}
