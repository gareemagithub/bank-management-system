package bank.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class PinChange extends JFrame implements ActionListener{

	JPasswordField pin,rePin;
	JButton change,back;
	String pinNumber;
	
	PinChange(String pinNumber){
		this.pinNumber=pinNumber;
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2= i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image =new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		
		JLabel text=new JLabel("CHANGE YOUR PIN");
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,16));
		text.setBounds(250,280,500,35);
		image.add(text);
		
		JLabel pinText=new JLabel("NEW PIN:");
		pinText.setForeground(Color.WHITE);
		pinText.setFont(new Font("System",Font.BOLD,16));
		pinText.setBounds(165,320,180,25);
		image.add(pinText);
		
		pin=new JPasswordField();
		pin.setFont(new Font("Raleway",Font.BOLD,25));
		pin.setBounds(330,320,180,25);
		
		JLabel rePinText=new JLabel("NEW PIN:");
		rePinText.setForeground(Color.WHITE);
		rePinText.setFont(new Font("System",Font.BOLD,16));
		rePinText.setBounds(165,320,180,25);
		image.add(rePinText);
		
		rePin=new JPasswordField();
		rePin.setFont(new Font("Raleway",Font.BOLD,25));
		rePin.setBounds(330,360,180,25);
		
		change=new JButton("CHANGE");
		change.setBounds(355,485,150,30);
		change.addActionListener(this);
		image.add(change);
		
		back=new JButton("CHANGE");
		back.setBounds(355,520,150,30);
		back.addActionListener(this);
		back.add(back);
		
		setSize(900,900);
		setLocation(300,0);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==change) {
			try {
				String newPin=pin.getText();
				String rePin=pin.getText();
				
				if(!newPin.equals(rePin)) {
					JOptionPane.showMessageDialog(null, "Entered pin does not change");
				}
				
				if(newPin.equals("")) {
					JOptionPane.showMessageDialog(null, "Please enter new Pin");
					return;
				}
				
				if(rePin.equals("")) {
					JOptionPane.showMessageDialog(null, "Please re-enter new Pin");
					return;
				}
				
				Conn conn=new Conn();
				String query1="update bank set pin='"+rePin+"' where pin='"+pinNumber+"'";
				String query2="update login set pin='"+rePin+"' where pin='"+pinNumber+"'";
				String query3="update signupthree set pin='"+rePin+"' where pin='"+pinNumber+"'";

				conn.s.executeUpdate(query1);
				conn.s.executeUpdate(query2);
				conn.s.executeUpdate(query3);

				JOptionPane.showMessageDialog(null, "Please re-enter new Pin");

				setVisible(false);
				new Transactions(rePin).setVisible(true);
				
			}catch(Exception e) {
				System.out.println(e);
			}

		}else {
			setVisible(false);
			new Transactions(pinNumber).setVisible(true);
		}
	}
	
	public static void main(String[] args) {
          new PinChange("").setVisible(true);
	}

}
