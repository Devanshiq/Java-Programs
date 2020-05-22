package javapractice;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//here we are  creating an instance of frame class 

public class AssociationAwt {
	AssociationAwt(){
//	{
//		addWindowListener(new WindowAdapter() {
//	  		public void windowClosing(WindowEvent ea)
//	  		{
//	  			dispose();
//	  		}
//	  	});
		Frame f= new Frame();
		Button b = new Button("Click me ");
		b.setBounds(30, 50, 80, 30);
		
		
	    f.add(b);
	    f.setSize(300, 300);
	    f.setLayout(null);
	    f.setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new AssociationAwt();
	}

}
