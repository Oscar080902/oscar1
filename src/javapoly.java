class M
{
   void ab()
   {
        System.out.println("Without arguments");
    }
    void ab(int a)
    {
        System.out.println("With arguments"+a);
    }
    void ab(int a,int b)
    {
        int sum=a+b;
       
        System.out.println("The sum is "+sum);
    }
    
}
public class javapoly 
{
    public static void main(String args[])
    {
            M obj=new M();
    obj.ab();
    obj.ab(19);
    obj.ab(10,20);
    
}
}
