interface A
{
    void display();
}
interface B
{
    void display1();
}
 class C implements A,B
{
    public void display()
    {
        System.out.print("welcome  ");
        
    }
     public void display1()
    {
        System.out.println("to college");
        
    }
}

 class javainterface
{
    public static void main(String args[])
    {
            C obj = new C();
            obj.display();
            obj.display1();
}
 }
