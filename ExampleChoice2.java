package event_handling;
import java.awt.*;    
import java.awt.event.*; 
//not running

public class ExampleChoice2 extends Frame implements ActionListener{
	Label l;Choice c;
	ExampleChoice2 ()
	{
		l = new Label();
		l.setBounds(100, 100, 300, 20);
		 c= new Choice();
		c.add("C");
		c.add("Java");
		c.add("PHP");
		c.add("C++");
		c.add("Python");
		c.setBounds(200, 250, 50, 50);
		Button b= new Button("Show ");
		b.setBounds(300, 250, 50, 50);
		b.addActionListener(this);
		add(b);add(l);add(c);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String data ="Programming Language Selected "+c.getItem(l.setText(data));
	}
	public static void main(String[] args) {
		new ExampleChoice2();
	}
}
