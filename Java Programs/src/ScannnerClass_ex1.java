//The Scanner class is used to get user input, and it is found in the java.util package.
//To use the Scanner class, create an object of the class 


import java.util.Scanner;  //importation of scanner class
public class ScannnerClass_ex1 
{
	public static void main(String[]args)
	{
		double height;
		double width;
		Scanner sc1 = new Scanner(System.in);  // creation of scanner class obj
		System.out.print("Enter Height= ");
		height = sc1.nextDouble();
		System.out.print("Enter Width= ");
		width = sc1.nextDouble();
		double area=height*width;
		System.out.print("Area of Rectangle is " + area);
		
		
	}

}
