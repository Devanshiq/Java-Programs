package event_handling;
//not running
import java.awt.*;
import java.awt.event.*;
public class MathsOperations extends Frame implements ActionListener{
TextField tf1,tf2,tf3;
Button b1,b2,b3;
MathsOperations()
{
	tf1=new TextField();
	tf1.setBounds(40, 50, 150, 20);
	tf2=new TextField();
	tf2.setBounds(40, 70, 150, 20);
	tf3=new TextField();
	tf3.setBounds(40, 90, 150, 20);
	tf3.setEditable(false);
	
	 b1 = new Button("+");
	b2.setBounds(60, 130, 20, 20);
	 b2 = new Button("-");
	b2.setBounds(100, 170, 20, 20);
	 b3 = new Button("x");
	b3.setBounds(140, 210, 20, 20);
	
	//register listener
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   
  	addWindowListener(new WindowAdapter() {
  		public void windowClosing(WindowEvent ea)
  		{
  			dispose();
  		}
  	});
	
   add(tf1);add(tf2);add(tf3);
	add(b1);add(b2);add(b3);
	setSize(500,500);
	setLayout(null);
	setVisible(true);
	}


@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	//Integer.parseInt(string str) is used for converting string into integer
	//String.valueOf(Integer c) is used for converting integer into string
	try {
	String s1= tf1.getText();
	String s2= tf2.getText();
	///String s3= tf1.getText();
//	int a=Integer.parseInt(s1);  // Integer is converted into int ????????????????
	int a =Integer.parseInt(s1);
	int b =Integer.parseInt(s2);
	//int c =Integer.parseInt(s3);
	int d=0;
	if(e.getSource()==b1)
	{
		d=a+b;
	}
	else if(e.getSource()==b2)
	{
		d=a-b;
	}
	else if(e.getSource()==b3)
	{
		d=a*b;
	}
	String value =String.valueOf(d);
	tf3.setText(value);
}
catch(Exception ex)
{
	System.out.println(ex);
	
}}
public static void main(String[] args) {
	new MathsOperations();
}
}
