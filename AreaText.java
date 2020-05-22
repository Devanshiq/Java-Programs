package event_handling;
import java.awt.*;
import java.awt.event.*;

public class AreaText extends Frame implements ActionListener {
	TextArea area = new TextArea("Welcome to javatpoint.");
	Label l1,l2; 
	AreaText(){
	area.setBounds(20,100,300,300);
	
	l1= new Label();
	l1.setBounds(50, 50, 100, 20);
	l2= new Label();
	l2.setBounds(160, 50, 100, 20);
	Button b = new Button("Count Words");
	b.setBounds(30, 400, 100, 20);
	b.addActionListener(this);
	
	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent ea)
		{
			dispose();
		}
	});
	 add(area);add(b);add(l1);add(l2);
	 setSize(400,400);
	 setLayout(null);
	 setVisible(true);
	 
	 
	 
	 }
	 @Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
		 String text=area.getText();
		 String words[]=text.split("\\s");
		 l1.setText("Words "+words.length);
		 l2.setText("Characters "+text.length());
		 
		 
			
		}
		
	public static void main(String[] args) {
		new AreaText();
	}
	

	
}
