import java.applet.Applet;import javax.swing.*; 
import java.awt.*;
import java.awt.*;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import java.lang.*;
public class pro extends Applet implements ActionListener {
 Image y,y2,back;
Dimension d;
Label l1;

 Font f0 = new Font("TimesRoman", Font.BOLD + Font.ITALIC, 50);
 Font f1 = new Font("TimesRoman", Font.BOLD, 30);
 Font f2 = new Font("TimesRoman", Font.BOLD, 20);
 Button but ;
 Choice c1 = new Choice();
 Choice c2 = new Choice();
 Choice c3 

= new Choice();
 Choice c4 = new Choice();
 Choice c5 = new Choice();
 Choice c6 = new Choice();
 Choice c7 = new Choice();
 Choice c8 = new Choice();
 Choice c9 = new Choice();
 Choice c10 = new Choice();


 public void init() {
 back = getImage(getDocumentBase(), "back.jpg");
but= new Button("Get Result!!");
  y = getImage(getDocumentBase(), "i.jpg");
//y2=getImage(getDocumentBase(),"i2.jpg");
  c1.add("Select");
  c1.add("A+");
  c1.add("A");
  c1.add("B+");
  c1.add("B");
  c1.add("C+");
  c1.add("C");
  c1.add("D");
  c1.add("F");
  c2.add("Select");
  c2.add("A+");
  c2.add("A");
  c2.add("B+");
  c2.add("B");
  c2.add("C+");
  c2.add("C");
  c2.add("D");
  c2.add("F");
  c3.add("Select");
  c3.add("A+");
  c3.add("A");
  c3.add("B+");
  c3.add("B");
  c3.add("C+");
  c3.add("C");
  c3.add("D");
  c3.add("F");
  c4.add("Select");
  c4.add("A+");
  c4.add("A");
  c4.add("B+");
  c4.add("B");
  c4.add("C+");
  c4.add("C");
  c4.add("D");
  c4.add("F");
  c5.add("Select");
  c5.add("A+");
  c5.add("A");
  c5.add("B+");
  c5.add("B");
  c5.add("C+");
  c5.add("C");
  c5.add("D");
  c5.add("F");
  c6.add("Select");
  c6.add("A+");
  c6.add("A");
  c6.add("B+");
  c6.add("B");
  c6.add("C+");
  c6.add("C");
  c6.add("D");
  c6.add("F");
  c7.add("Select");
  c7.add("A+");
  c7.add("A");
  c7.add("B+");
  c7.add("B");
  c7.add("C+");
  c7.add("C");
  c7.add("D");
  c7.add("F");
  c8.add("Select");
  c8.add("A+");
  c8.add("A");
  c8.add("B+");
  c8.add("B");
  c8.add("C+");
  c8.add("C");
  c8.add("D");
  c8.add("F");
  c9.add("Select");
  c9.add("A+");
  c9.add("A");
  c9.add("B+");
  c9.add("B");
  c9.add("C+");
  c9.add("C");
  c9.add("D");
  c9.add("F");
  c10.add("Select");
  c10.add("A+");
  c10.add("A");
  c10.add("B+");
  c10.add("B");
  c10.add("C+");
  c10.add("C");
  c10.add("D");
  c10.add("F");
  c1.setBounds(560, 200, 130, 30);
  c2.setBounds(560, 240, 130, 30);
  c3.setBounds(560, 280, 130, 30);
  c4.setBounds(560, 320, 130, 30);
  c5.setBounds(560, 360, 130, 30);
  c6.setBounds(560, 400, 130, 30);
  c7.setBounds(880, 200, 130, 30);
  c8.setBounds(880, 240, 130, 30);
  c9.setBounds(880, 280, 130, 30);
  c10.setBounds(880, 320, 130, 30);
  but.setBounds(590, 540, 100, 40);
  add(c1);
  add(c2);
  add(c3);
  add(c4);
  add(c5);
  add(c6);
  add(c7);
  add(c8);
  add(c9);
  add(c10);
  add(but);
  but.addActionListener(this);
setLayout(null); 
 }
 public void paint(Graphics g) {
  g.setFont(f0);
  g.drawImage(y, 3, 3, this);
  g.setColor(Color.white);
  g.drawString("Welcome to the Swapnil's Project", 390, 55);
  g.setFont(f1);
  g.setColor(Color.green);
  g.drawString("Please enter the grades of the respective subjects", 410, 150);
  g.setColor(Color.black);
  g.setFont(f2);
  g.drawString("Microprocesser and interfacing(Theory) :", 200, 220);
  g.drawString("Java programming(Theory) :", 300, 260);
  g.drawString("Professional Communication(Theory) :", 200, 300);
  g.drawString("Computer Organization (Theory):", 250, 340);
  g.drawString("Mathematics-III(Theory) :", 300, 380);
  g.drawString("Cyber law (Theory) : ", 350, 420);
  g.drawString("Practicle :", 780, 220);
  g.drawString("Practicle :", 780, 260);
  g.drawString("Practicle :", 780, 300);
  g.drawString("Computer Lab II :", 710, 340);
g.drawString("Note:Please make sure you have submited all the fields otherwise you will not get any response.",20,640);

 }
 public void actionPerformed(ActionEvent e) {


  String a = c1.getSelectedItem();
  String b = c2.getSelectedItem();
  String c = c3.getSelectedItem();
  String d = c4.getSelectedItem();
  String x = c5.getSelectedItem();


  String z = c6.getSelectedItem();
  String g = c7.getSelectedItem();
  String h = c8.getSelectedItem();
  String i = c9.getSelectedItem();
  String j = c10.getSelectedItem();
  int p, q, r, s, t, u, v, w, m, n, o;
  if (a.equals("A+")) {
   p = 4 * 10;
  } else if (a.equals("A")) {
   p = 4 * 9;
  } else if (a.equals("B+")) {
   p = 4 * 8;
  } else if (a.equals("B")) {
   p = 4 * 7;
  } else if (a.equals("C+")) {
   p = 4 * 6;
  } else if (a.equals("C")) {
   p = 4 * 5;
  } else if (a.equals("D")) {
   p = 4 * 4;
  } else {
   p = 0;
   //t11.setText("Please check");
   System.exit(0);
  }


  if (b.equals("A+")) {
   q = 3 * 10;
  } else if (b.equals("A")) {
   q = 3 * 9;
  } else if (b.equals("B+")) {
   q = 3 * 8;
  } else if (b.equals("B")) {
   q = 3 * 7;
  } else if (b.equals("C+")) {
   q = 3 * 6;
  } else if (b.equals("C")) {
   q = 3 * 5;
  } else if (b.equals("D")) {
   q = 4 * 4;
  } else {
   q = 0;
   //t11.setText("Please check");
   System.exit(0);
  }
  if (c.equals("A+")) {
   r = 2 * 10;
  } else if (c.equals("A")) {
   r = 2 * 9;
  } else if (c.equals("B+")) {
   r = 2 * 8;
  } else if (c.equals("B")) {
   r = 2 * 7;
  } else if (c.equals("C+")) {
   r = 2 * 6;
  } else if (c.equals("C")) {
   r = 2 * 5;
  } else if (c.equals("D")) {
   r = 4 * 4;
  } else {
   r = 0;
   //t11.setText("Please check");
   System.exit(0);
  }
  if (d.equals("A+")) {
   s = 4 * 10;
  } else if (d.equals("A")) {
   s = 4 * 9;
  } else if (d.equals("B+")) {
   s = 4 * 8;
  } else if (d.equals("B")) {
   s = 4 * 7;
  } else if (d.equals("C+")) {
   s = 4 * 6;
  } else if (d.equals("C")) {
   s = 4 * 5;
  } else if (d.equals("D")) {
   s = 4 * 4;
  } else {
   s = 0;
   //t11.setText("Please check");
   System.exit(0);
  }
  if (x.equals("A+")) {
   t = 4 * 10;
  } else if (x.equals("A")) {
   t = 4 * 9;
  } else if (x.equals("B+")) {
   t = 4 * 8;
  } else if (x.equals("B")) {
   t = 4 * 7;
  } else if (x.equals("C+")) {
   t = 4 * 6;
  } else if (x.equals("C")) {
   t = 4 * 5;
  } else if (x.equals("D")) {
   t = 4 * 4;
  } else {
   t = 0;
   //t11.setText("Please check");
   System.exit(0);
  }
  if (z.equals("A+")) {
   u = 3 * 10;
  } else if (z.equals("A")) {
   u = 3 * 9;
  } else if (z.equals("B+")) {
   u = 3 * 8;
  } else if (z.equals("B")) {
   u = 3 * 7;
  } else if (z.equals("C+")) {
   u = 3 * 6;
  } else if (z.equals("C")) {
   u = 3 * 5;
  } else if (z.equals("D")) {
   u = 4 * 4;
  } else {
   u = 0;
   //t11.setText("Please check");
   System.exit(0);
  }
  if (g.equals("A+")) {
   v = 1 * 10;
  } else if (g.equals("A")) {
   v = 1 * 9;
  } else if (g.equals("B+")) {
   v = 1 * 8;
  } else if (g.equals("B")) {
   v = 1 * 7;
  } else if (g.equals("C+")) {
   v = 1 * 6;
  } else if (g.equals("C")) {
   v = 1 * 5;
  } else if (g.equals("D")) {
   v = 4 * 4;
  } else {
   v = 0;
   //t11.setText("Please check");
   System.exit(0);
  }
  if (h.equals("A+")) {
   w = 1 * 10;
  } else if (h.equals("A")) {
   w = 1 * 9;
  } else if (h.equals("B+")) {
   w = 1 * 8;
  } else if (h.equals("B")) {
   w = 1 * 7;
  } else if (h.equals("C+")) {
   w = 1 * 6;
  } else if (h.equals("C")) {
   w = 1 * 5;
  } else if (h.equals("D")) {
   w = 4 * 4;
  } else {
   w = 0;
   //t11.setText("Please check");
   System.exit(0);
  }
  if (i.equals("A+")) {
   m = 1 * 10;
  } else if (i.equals("A")) {
   m = 1 * 9;
  } else if (i.equals("B+")) {
   m = 1 * 8;
  } else if (i.equals("B")) {
   m = 1 * 7;
  } else if (i.equals("C+")) {
   m = 1 * 6;
  } else if (i.equals("C")) {
   m = 1 * 5;
  } else if (i.equals("D")) {
   m = 4 * 4;
  } else {
   m = 0;
   //t11.setText("Please check");
   System.exit(0);
  }
  if (j.equals("A+")) {
   n = 1 * 10;
  } else if (j.equals("A")) {
   n = 1 * 9;
  } else if (j.equals("B+")) {
   n = 1 * 8;
  } else if (j.equals("B")) {
   n = 1 * 7;
  } else if (j.equals("C+")) {
   n = 1 * 6;
  } else if (j.equals("C")) {
   n = 1 * 5;
  } else if (j.equals("D")) {
   n = 4 * 4;
  } else {
   n = 0;
   //t11.setText("Please check");
   System.exit(0);
  }
remove(c1);
remove(c2);
remove(c3);
remove(c4);
remove(c5);
remove(c6);
remove(c7);
remove(c8);remove(c9);remove(c10);remove(but);
//removeImage(y);
  float Result = p + q + r + s + t + u + v + w + m + n;
  float SGPA = (Result / 24);
  String now = Float.toString(SGPA);
Color show = new Color(147,200,28);
setBackground(show);
 setForeground(Color.white);
Label l1=new Label("Your SGPA is : "+now,Label.CENTER);
l1.setBounds(0,0,1400,700);
l1.setFont(new Font("TimesRoman", Font.BOLD + Font.ITALIC, 50));
add(l1);


//getGraphics().drawString("Your SGPA is:"+now,150,50);

 }
}
/*<applet code="pro.class" width="900" height="900"></applet>*/

