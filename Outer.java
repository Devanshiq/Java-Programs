package event_handling;
import java.awt.event.*;

public class Outer implements ActionListener{

	//we have to create the object of program class here and pass it in outer()constructor
	Program1 obj;  //why we are able to create this
	Outer( Program1 obj){  //why are we declaring it again
		this.obj=obj;
	}
	
	
	
	@Override
	//event you want to perform is written in actionPerformed method
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		obj.tf.setText("Welcome");
	}
	

}
