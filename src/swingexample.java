import javax.swing.*;
public class swingexample
{
public static void main(String args[])
{
JFrame ob = new JFrame();

JButton b = new JButton("Button 1");
b.setBounds(770,200,100,40);

JButton c = new JButton("Button 2");
c.setBounds(880,200,100,40);

JButton d = new JButton("Button 3");
d.setBounds(990,200,100,40);

JLabel l = new JLabel("Welcome RAAHUL");
l.setBounds(900,5,200,100);

JLabel un = new JLabel("Username");
un.setBounds(850,33,200,100);

JTextField t = new JTextField("Hello RAAHUL");
t.setBounds(850, 100, 170, 25);

JRadioButton rb = new JRadioButton("MALE");
rb.setBounds(950,400,100,20);
JRadioButton rb1 = new JRadioButton("FEMALE");
rb1.setBounds(850,400,100,20);

JCheckBox cb = new JCheckBox();
JLabel lb = new JLabel("I Understand the terms and conditions ");
lb.setBounds(800,100,300,500);
cb.setBounds(1025,338,170,25);

String Dept[] = {"IT","CSBS","CSE","ECE","EEE"};
JComboBox jb = new JComboBox(Dept);
jb.setBounds(900,450,100,30);

JLabel pn = new JLabel("Password");
pn.setBounds(850,88,200,100);

JPasswordField p = new JPasswordField();
p.setBounds(850, 150, 170, 25);

JScrollBar sb = new JScrollBar();
sb.setBounds(1900,5, 20,1000);  

DefaultListModel<String> l1 = new DefaultListModel();
l1.addElement("IT");
l1.addElement("CSE");
l1.addElement("csbs");
l1.addElement("BME");
l1.addElement("ISE");
final JList<String> list = new JList(l1);
list.setBounds(900,500, 75,75);

String De[][]={{"101","IT","1000"},{"102","CSE","1651"},{"103","CSBS","68498"},{"104","BE","21564"}};
String col[]={"ID","DEPT","COUNT"};
JTable jt = new JTable(De,col);
jt.setBounds(800, 600, 300, 100);

        
ob.add(b);
ob.add(c);
ob.add(d);
ob.add(l);
ob.add(t);
ob.add(cb);
ob.add(lb);
ob.add(rb);
ob.add(rb1);
ob.add(jb);
ob.add(p);
ob.add(un);
ob.add(sb);
ob.add(list);
ob.add(jt);
ob.add(pn);
ob.setSize(200,200);



ob.setLayout(null);
ob.setVisible(true);

}

}