//public Access Modifier- If the class is declared as public then that class is accessible from outside the class 
                                    //and outside the package also.It has wide use

public class publicaccessmodifer 
{
	public void msg()
	{
		System.out.println("Hello,JAVA");
	}
	
	public static void main(String[]args)
	{
		publicaccessmodifer pam = new publicaccessmodifer();
		pam.msg();
	}

}
