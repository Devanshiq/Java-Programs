package event_handling;
import java.awt.*;    
import java.awt.event.*; 

public class ExampleChoice extends Frame {
	ExampleChoice()
	{
		Choice c = new Choice();
		c.setBounds(100, 100, 75, 75);
		c.add(" Item1");
		c.add(" Item2");
		c.add(" Item3");
		c.add(" Item4");
		c.add(" Item5");
		add(c);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ea)
			{
				dispose();
			}
		});
		setSize(400,400);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ExampleChoice();
	}

}
