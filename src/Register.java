import java.awt.Color;
import javax.swing.*;

public class Register {
    public static void main(String args[])
    {
    JFrame ob = new JFrame();
    ob.getContentPane().setBackground(Color.pink);
    ob.setSize(1000,1000);
    ob.setLayout(null);
    ob.setVisible(true);  
    
    JLabel r = new JLabel("REGISTRATION PAGE");
    r.setBounds(950,5,200,100);
    ob.add(r);
    
    JButton rn = new JButton("Enter Roll No");
    rn.setBounds(900, 100, 200, 30);
    ob.add(rn);        
    
    JButton an = new JButton("Add new");
    an.setBounds(650, 100, 200, 30);
    ob.add(an);
    
    JButton s = new JButton("Search");
    s.setBounds(1150, 100, 200, 30);
    ob.add(s);
    
  
    JLabel ln = new JLabel("Roll No");
    ln.setBounds(805, 140,200,100);
    ob.add(ln);
    
    JTextField ln1 = new JTextField();
    ln1.setBounds(850, 180, 250, 25);
    ob.add(ln1);
    
    JLabel pn = new JLabel("Name");
    pn.setBounds(805, 200,200,100);
    ob.add(pn);
    
    JTextField nn = new JTextField();
    nn.setBounds(850, 240, 250, 25);
    ob.add(nn);
    
    JLabel em = new JLabel("Mobile Number");
    em.setBounds(755, 260,200,100);
    ob.add(em);
    
    JTextField e = new JTextField();
    e.setBounds(850, 300, 250, 25);
    ob.add(e);
 
    
    JButton bt = new JButton("Register");
    bt.setBounds(900, 400, 200, 30);
    ob.add(bt);    
    
    JButton in = new JButton("Insert");
    in.setBounds(650, 400, 200, 30);
    ob.add(in); 
    
    JButton de = new JButton("Delete");
    de.setBounds(1150, 400, 200, 30);
    ob.add(de); 
    
    }
    
            
         
}




   
   /* 
    
    JLabel ad = new JLabel("Address");
    ad.setBounds(850, 300,200,100);
    ob.add(ad);
    
    JTextField ad1 = new JTextField();
    ad1.setBounds(850, 360, 250, 25);
    ob.add(ad1);
    
    JLabel ge = new JLabel("Gender");
    ge.setBounds(850, 360,100,100);
    ob.add(ge);
    
    JRadioButton rb = new JRadioButton("MALE");
    rb.setBounds(950,430,100,20);
    ob.add(rb);

    JRadioButton rb1 = new JRadioButton("FEMALE");
    rb1.setBounds(850,430,100,20);
    ob.add(rb1);

*/