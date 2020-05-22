package javapractice;
import java.awt.*;
import java.awt.event.*;
//inheriting the frame class
//event handling code within the class
public class InheritanceAwt extends Frame implements ActionListener{
	TextField  tf=new TextField();;
	InheritanceAwt()
	{   tf.setBounds(60, 50, 170, 20);
		Button b = new Button("Click me ");
		b.setBounds(30, 100, 80, 30);
		b.addActionListener(this);
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
		new InheritanceAwt();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		tf.setText("Welcome");
	}
	
}
