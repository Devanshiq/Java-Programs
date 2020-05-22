package event_handling;
import java.awt.*;
import java.awt.event.*;

//Java event handling by anonymous class 
// here we are not implementing interface but creating anonymous class
public class Program2 extends Frame{
	TextField tf;// why here mentioning reference of textfield will also work. We are not creating object here
	
	Program2()
	{
		tf=new TextField();
		tf.setBounds(40, 50, 150, 20);
		Label l1=new Label("First");
		Label l2 = new Label("Second");
		l1.setBounds(40, 70, 100, 20);
		l2.setBounds(40, 90, 100, 20);
		Button b = new Button("Click me");
		b.setBounds(60, 120, 80, 20);
		//register listener
	
		b.addActionListener(new ActionListener() {
//			public void actionPerformed() {
//				
//			}

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tf.setText(" Hi, how are you doing");
			}});
		addWindowListener(new WindowAdapter() {
	  		public void windowClosing(WindowEvent ea)
	  		{
	  			dispose();
	  		}
	  	});
		
		add(l1);add(l2);
		add(b);add(tf);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		}
		public static void main(String[] args) {
			new Program2();
		}
	}


