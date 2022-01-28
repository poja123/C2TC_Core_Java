
class addsuboperations
{
    int sum(int i, int j)
    {
        return i+j;
    }
    int sub(int a, int b)
    {
        return a-b;
    }

}
class muldivoperations extends addsuboperations
{
    int mul(int y , int h)
    {
        return y*h;
    }
    int div(int g, int d)
    {
        return g*d;
    }
}
class 	SingleInheritanceex1
{
    public static void main(String[]args)
    {
        muldivoperations obj1 = new muldivoperations();
        System.out.println("The addition is"+obj1.sum(4, 6));
        System.out.println("The subtraction is "+obj1.sub(7, 9));
        System.out.println("The multiplication is "+obj1.mul(8, 7));
        System.out.println("The division is "+obj1.div(6, 2));

    }
}
