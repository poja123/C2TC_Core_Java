//finally block always executes in any situation whether the exception of try block handled by catch block or not

public class FinallyBlock
{    
      public static void main(String args[]){   
  
      try {    
  
        System.out.println("Inside the try block");  
            
       //int data=25/0;  
        int data[] = new int[8];
        System.out.println(data[10]);
       
       System.out.println(data);    
      }    
      
      catch(ArithmeticException e){  
        System.out.println(e);  
      } 
      
      //catch(ArrayIndexOutOfBoundsException e)
      //{
    	//  System.out.println(e);
     // }
  
     
      finally {  
        System.out.println("finally block is always executed");  
      }    
  
      System.out.println("rest of the code...");    
      }    
    }    