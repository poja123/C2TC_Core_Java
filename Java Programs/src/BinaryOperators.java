//Binary Operators -(i)-Arithmetic Operators-it is used to perform mathematical operation
//					(ii)-Relational Operators-it is used to compare values to form condition
// 					(iii)-Logical AND  -it is used to combine two or more condn if both condn r true o/p will b true
//					(iv)-Logical OR  -it is used to combine two or more condn if any one  condn is true o/p will b true

public class BinaryOperators
{
		//ArithmeticOperators
				//   	"+"-Addition 
				//(if both operands are int then it will perform as addition and if anyone operand is string thn 
								//it will perform "concatenation" this process is known as Operator Overloading 
				//		"-"-Subtraction
				//  	 "*"-Multiplication
				//		 "/"-Division
				//		 "%"-Modulus
	
		//RelationalOperators
				// ">"-Greater than
				// "<" -Lesser than
				// "=="  -Equal to
				// "!="   -NotEqualto 
				// ">="  -Greater than or equal to
				//"<="  -Lesser than or equal to
	   //Logical AND 
	  //Logical OR
	
	
	public static void main(String[]args)
	{
		System.out.println( 10+20+90+85-67*3); //Arithmetic
		System.out.println(10+40+"40"+67+87); //concatenation
	
		//Relational Operators
				int a = 30, b = 20, c = 5,d = 10;
				System.out.println("a = " +a);
				System.out.println("b= " +b);
				System.out.println("c= " + c);
				System.out.println("a > b: " + (a > b));
				System.out.println("b <= c: " + (b <= c));
				System.out.println("d >= c: " + (d >= c));
				
		//Logical AND
				int m = 10, n = 20;
		        System.out.println(m!=n && ++m==++n);
		        System.out.println(m);
		        System.out.println(n);
		       
		 //Logical OR
		        int x = 10, y = 20;
		        System.out.println(x!=y || ++x==++y); //(in OR if one operand execute to b true other operation wont execute)  
		        System.out.println(x);
		        System.out.println(y);
		        
		  
			}


	}
	


