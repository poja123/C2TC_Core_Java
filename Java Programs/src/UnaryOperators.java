public class UnaryOperators 
{


	//Unary Operators
	        //(i)Logical NOT Operators(!)
	            //It is used to inverse the condition 
	                        //input-->output
	                        //true-->false
	                        //false-->true
	        //(ii)Increament Operator
	            //It is used to increase the value by 1 based on the position of operator
	                    //(a)Post-Increament Operator : Syntax - Variable++(do operation thn increase value)
	                    //(b)Pre-Increament Operato : Syntax - ++Variable(increase the value thn do operation)
	        //(iii)Decreament Operator
	            //It is used to decrease the value by 1 based on the position of operator
	                    //(a)Pre-Decreament Operator: Variable--
	                    //(b)Post-Decreament Operator: --Variable
	        
	    public static void main(String[] args) 
	    {
	        //Logical NOT(!)
	        int n=8;
	        System.out.println(n%2==0);
	        System.out.println(!(n%2==0)); //inverse the ouput of condn

	        //Post-Increament Operator(Variable++)
	        int j = n++;  //firstly stores the current value thn add (added value stored in n)
	        System.out.println(j);
	        System.out.println(n);
	        //Pre-Increament Operator(++Variable)
	        int i = ++n;    //firstly adds the value thn stores the value in both variable
	        System.out.println(i);
	        System.out.println(n);

	        //Pre-Decreament Operator(Variable--)
	        int f = n--; //(stores the literal of mentioned variabe thn do operation  )
	        System.out.println(f);
	        System.out.println(n);

	        int d = --n;
	        System.out.println(d); //do the operation thn stores
	        System.out.println(n);




	}

}
