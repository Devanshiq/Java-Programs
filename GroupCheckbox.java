package event_handling;
import java.awt.*;
import java.awt.event.*;

public class GroupCheckbox extends Frame{
	GroupCheckbox()
	{
		CheckboxGroup cbg= new CheckboxGroup();
		Checkbox c1 = new Checkbox("C++",cbg,false);//what is false here denoting
		c1.setBounds(100, 100, 50, 50);
		CheckboxGroup cbg1= new CheckboxGroup();
		Checkbox c2 = new Checkbox("Java",cbg1,true);//what is true denoting
		c2.setBounds(100, 170, 50, 50);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent ea)
			{
				dispose();
			}
		});
		add(c1);add(c2);
		setSize(400,400);
		setVisible(true);
		setLayout(null);
		
	    
	
	}
	public static void main(String[] args) {
		
		 new GroupCheckbox();
	}

}
