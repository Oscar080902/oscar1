import java.util.Scanner;
public class Ecommerce 
{
   public static void main(String args[])
   {
    Scanner  sc = new Scanner(System.in);   
    System.out.print("Enter your customer id : ");  
    int a = sc.nextInt();
    
    System.out.print("Enter your customer name: ");  
    String b = sc.next();
    System.out.println("\n");
    System.out.print("Enter your customer mobile number: "); 
    
    float c = sc.nextFloat();
    
     System.out.println("product id - 1 ");
     System.out.println("product name - Ring "); 
     System.out.println("product cost - 250 ");
     System.out.println("\n");
     
     System.out.println("product id - 2 ");  
     System.out.println("product name - Chain"); 
     System.out.println("product cost - 300 ");
     System.out.println("\n");
     
     System.out.print("Enter the product id you want to buy : ");  
     int d = sc.nextInt();
     
     System.out.print("Enter the no.of products you want to buy ");  
     int e = sc.nextInt();
     
     int f = (e*250);
     int g = (e*300);
     
     System.out.println("Purchase order summary");  
     {
     if (d==1)
             {
                System.out.println("Product id : "+d);   
                System.out.println("Customer name: "+b);   
                System.out.println("Product name : Ring");   
                System.out.println("Total  "+f);   
             }
     else
     {
                System.out.println("Product id : "+d);   
                System.out.println("Customer name: "+b);   
                System.out.println("Product name : Chain"); 
                System.out.println("total : "+g);   
     }
     }
     System.out.println("\n");
     System.out.println("Ordered Successfully");
}
   
}
 