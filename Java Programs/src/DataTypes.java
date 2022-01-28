public class DataTypes 
{
	//DataTypes 2- Primitive Datatype and Nonprimitive datatype
	//Primitive Datatype - 1-Boolean 2-Numeric (where size is fixed)
	//1-Boolean- (i)boolean
	//2- Numeric (i)-Character (ii) Integeral 
	//(i)-Character- char 
	//(ii)-Integral - a-Integer b-Floating point
	//a-Integer- byte,short,int,long
	//b-Floating point- double,float
	//Non-Primitive Datatype Class,String,Array(where size is not fixed)
	    public static void main(String[]args)
	    {
	        
	        //boolean datatype 
	        boolean b =true;
	        System.out.println(b);

	        //char datatype(0-65536 character can be stored )
	        char c = 'a';
	        System.out.println(c);

	        //byte  datatype (-128 to +127 crange size )(8 bits)(1 byte)
	        byte bb1 = 100;
	        System.out.println(bb1);
	       // byte bb2 = 340; //(it will be error as value is greater than the range -128 to +128)
	       // System.out.println(bb2);

	       //short data type(-32,768(2^15) to 32,767(2^15-1))(16 bits)(2byte)
	       short s1 = 10;
	       System.out.println(s1);

	       //int data type(2,147,483,648(-2^15) to (2,147,483,647)2^15-1)) (4bytes)(32 bits)
	       int in1 = 1000000;
	       System.out.println(in1);

	       //short s13 = 100000; // DIFF BETWEEN INT AND SHORT RANGE SIZE IS SMALLER IN SHORT AS COMPARE TO INT
	       //System.out.println(s13);

	       //long datattype (-9,223,372,036,854,775,808(-2^63)) to (-9,223,372,036,854,775,807(2^63-1))
	                        //(8 bytes)(64 bits)
	                     
	        long l1 = 100000000;
	        System.out.println(l1);   

	        // float datatype (32 bit IEEE 754 FLOATING POINT)(as float is not a 
	                            //default datatype of decimal we must include f with float literal)

	        float f = 1.56f;
	        System.out.println(f);

	        //double datatype (64 bit IEEE 754 FLOATING POINT)(as its a default decimal type we can or cannot include d doesnt matter )
	        double d = 1.5667675;
	        System.out.println(d);
	    
	        

	    }
	}

