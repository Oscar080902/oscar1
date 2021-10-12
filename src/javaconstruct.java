class N
{
   N()
   {
        System.out.println("Without arguments");
    }
     N(int a)
    {
        System.out.println("With arguments"+a);
    }
     N(int a,int b)
    {
        int sum=a+b;
        System.out.println("The sum is "+sum);
    }
    
}
public class javaconstruct
{
    public static void main(String args[])
    {
            N obj=new N();
            N obj1=new N(10);
            N obj2=new N(20,30);
   
    
}
}

