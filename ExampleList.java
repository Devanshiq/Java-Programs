package event_handling;
import java.awt.*;    
import java.awt.event.*; 

public class ExampleList extends Frame {
	
	ExampleList()
	{
		List l =new List(10);
		l.setBounds(100, 100, 75, 75);
		l.add("Item 1");
		l.add("Item 2");
		l.add("Item 3");
		l.add("Item 4");
		l.add("Item 5");
		l.add("Item 6");
		l.add("Item 7");
		l.add("Item 8");
		l.add("Item 9");
		l.add("Item 10");
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ea)
			{
				dispose();
			}
		});
		add(l);
		setSize(400,400);
		setLayout(null);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ExampleList();
	}

}
