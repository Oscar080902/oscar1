package javaabstract;

abstract class shape
{
    abstract void draw();
    
    
}
class rectangle extends shape
{
    @Override
    void draw()
    {
        System.out.println("drawing rectangle");
        
    }
}
class circle extends shape
{
    @Override
    void draw()
    {
        System.out.println("drawing circle");
    }
}
public class javaabstract
        {
            public static void main(String args[])
            {
                shape obj=new circle();
                obj.draw();
                 shape obj1=new rectangle();
                obj1.draw();
            }
        }
