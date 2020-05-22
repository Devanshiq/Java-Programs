package event_handling;
import java.awt.*;
import java.awt.event.*;
//not running

public class BoxCheck extends Frame implements ItemListener{// how to give title to frame here
    Label l;
	 BoxCheck()
	 {   l.setAlignment(Label.CENTER);
	 l.setSize(400, 100);
		 Checkbox c1=new Checkbox("C++");
		 c1.setBounds(100, 100, 50, 50);
		 Checkbox c2=new Checkbox("Java",true);
		 c2.setBounds(150, 150, 50, 50);
		 c1.addItemListener(this);
		 
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
	
	 @Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
		 l.setText("C++Checkbox :"+(e.getStateChange()==1?"checked":"unchecked"));
			
		}
	public static void main(String[] args) {
	new BoxCheck ();	
	}

	

}
