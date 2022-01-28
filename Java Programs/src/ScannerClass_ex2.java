import java.util.Scanner;

public class ScannerClass_ex2
{
	  public static void main(String[] args) 
	  {
	    Scanner sc2 = new Scanner(System.in);

	    System.out.print("Enter name= ");
	    String name = sc2.nextLine();   // for string-nextLine()
	    System.out.print("Enter age= ");
	    int age = sc2.nextInt();
	    System.out.print("Enter age= ");
	    double salary = sc2.nextDouble();
	    System.out.println("Name: " + name); 
	    System.out.println("Age: " + age); 
	    System.out.println("Salary: " + salary); 
	  }
	}


