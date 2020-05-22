package event_handling;
import java.awt.*;
import java.awt.event.*;

//java program to get ip address of the host website
public class Address extends Frame implements ActionListener {
	TextField tf;Label l1;
	Address(){
	tf=new TextField();
	tf.setBounds(40, 50, 150, 20);
	 l1=new Label();
	
	l1.setBounds(40, 70, 300, 20);
	
	Button b = new Button("Find IP");
	b.setBounds(60, 120, 80, 20);
	//register listener
   b.addActionListener(this);
	addWindowListener(new WindowAdapter() {
		public void windowClosing(WindowEvent ea)
		{
			dispose();
		}
	});
	add(l1);
	add(b);add(tf);
	setSize(300,300);
	setLayout(null);
	setVisible(true);
	}
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
			String host = tf.getText();
			String ip=java.net.InetAddress.getByName(host).getHostAddress();  //unknownHostException is thrown here 
			                                                                  //giving above exception when net is off
		l1.setText("IP of "+host+ "is"+ip);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
	public static void main(String[] args) {
		new Address();
	}

}
