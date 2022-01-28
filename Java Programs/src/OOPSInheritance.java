//Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object.
class Employee
{  
float salary=40000;  
}  

class OOPSInheritance extends Employee
{  
 int bonus=10000;  
 public static void main(String args[])
{  
OOPSInheritance p=new OOPSInheritance();  
System.out.println(" salary is:"+p.salary);  
System.out.println("Bonus of this month  is:"+p.bonus);  
}  
}  


