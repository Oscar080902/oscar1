import java.awt.*;
import javax.swing.*;
public class Login
{
public static void main(String args[])
{
JFrame ob = new JFrame();
ob.setSize(200,200);
ob.setLayout(null);
ob.setVisible(true);
ob.getContentPane().setBackground(Color.CYAN);

JLabel ln = new JLabel("LOGIN PAGE");
ln.setBounds(900,50,200,100);

JLabel un = new JLabel("Username");
un.setBounds(850,113,200,100);
JTextField tf = new JTextField("Enter Username");
tf.setBounds(850, 180, 200, 25);

JLabel pn = new JLabel("Password");
pn.setBounds(850,168,200,100);
JPasswordField p = new JPasswordField();
p.setBounds(850, 230, 200, 25);

JButton c = new JButton("LOGIN");
c.setBounds(880,280,100,40);


ob.add(c);
ob.add(un);
ob.add(pn);
ob.add(tf);
ob.add(p);
ob.add(ln);
}
}