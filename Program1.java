package event_handling;
import java.awt.*;
import java.awt.event.*;

//event handling by outer class

public class Program1 extends Frame {
TextField tf = new TextField();
Program1()
{
	tf.setBounds(40, 50, 100, 20);
Button b = new Button("Click me");
b.setBounds(60, 100, 100, 20);
//register listener
Outer o = new Outer(this);// object of program1 class is passed in this
b.addActionListener(o);
addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent ea)
		{
			dispose();
		}
	});

add(b);add(tf);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public static void main(String[] args) {
	new Program1();
}
}
