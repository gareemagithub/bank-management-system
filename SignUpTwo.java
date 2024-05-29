package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignUpTwo extends JFrame implements ActionListener{
	
	JTextField nameTextField,fnameTextField,dobTextField,emailTextField,addressTextField,cityTextField,stateTextField,pinTextField;
	JButton next;
	JRadioButton syes,sno,eyes,eno;
	JComboBox religion, category,occupation,education,income;
	String formno;
	
	SignUpTwo(String formno){
		this.formno=formno;
		setLayout(null);
 		
		setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
				
		JLabel additionalDetails =new JLabel("Page 2: Additional Details");		
		additionalDetails.setFont(new Font("Raleway",Font.BOLD,22));
		additionalDetails.setBounds(290,80,400,30);
		add(additionalDetails);
		
		JLabel religionName =new JLabel("Religion:");		
		religionName.setFont(new Font("Raleway",Font.BOLD,20));
		religionName.setBounds(100,140,100,30);
		add(religionName);
		String valReligion[]={"Hindu","Muslim","Sikh","Christian","Other"};
		religion=new JComboBox(valReligion);
		religion.setBounds(300, 140, 400, 30);
		religion.setBackground(Color.WHITE);
		add(religion);
		
		JLabel casteCategory =new JLabel("Category:");		
		casteCategory.setFont(new Font("Raleway",Font.BOLD,20));
		casteCategory.setBounds(100,190,200,30);
		add(casteCategory);
		String valcategory[]= {"General","OBC","SC","ST","Other"};
		category=new JComboBox(valcategory);
		category.setBounds(300, 190, 400, 30);
		category.setBackground(Color.WHITE);
		add(category);
		
		JLabel totalIncome =new JLabel("Income:");		
		totalIncome.setFont(new Font("Raleway",Font.BOLD,20));
		totalIncome.setBounds(100,240,200,30);
		add(totalIncome);
		String incomecategory[]= {"Null","< 1,50,000","<2,50,000","<5,00,000","Upto 10,00,000"};
		income=new JComboBox(incomecategory);
		income.setBounds(300, 240, 400, 30);
		income.setBackground(Color.WHITE);
		add(income);
		
		JLabel qualification =new JLabel("Educational");		
		qualification.setFont(new Font("Raleway",Font.BOLD,20));
		qualification.setBounds(100,290,200,30);
		add(qualification);
		
		JLabel email =new JLabel("Qualification:");		
		email.setFont(new Font("Raleway",Font.BOLD,20));
		email.setBounds(100,325,200,30);
		add(email);
		String educationValues[]= {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
		education=new JComboBox(educationValues);
		education.setBounds(300, 315, 400, 30);
		education.setBackground(Color.WHITE);
		add(education);
		
		JLabel currentOccupation =new JLabel("Occupation:");		
		currentOccupation.setFont(new Font("Raleway",Font.BOLD,20));
		currentOccupation.setBounds(100,390,200,30);
		add(currentOccupation);
		
		String occupationValues[]= {"Job","Self-Employed","Bussiness","Student","Retired","Others"};
		occupation=new JComboBox(occupationValues);
		occupation.setBounds(300, 390, 400, 30);
		occupation.setBackground(Color.WHITE);
		add(occupation);
		
		JLabel panNumber =new JLabel("PAN Number:");		
		panNumber.setFont(new Font("Raleway",Font.BOLD,20));
		panNumber.setBounds(100,440,200,30);
		add(panNumber);
		addressTextField=new JTextField();
		addressTextField.setFont(new Font("Raleway",Font.BOLD,14));
		addressTextField.setBounds(300, 440, 400, 30);
		add(addressTextField);
		
		JLabel adharNumber =new JLabel("Aadhar Number:");		
		adharNumber.setFont(new Font("Raleway",Font.BOLD,20));
		adharNumber.setBounds(100,490,200,30);
		add(adharNumber);
		cityTextField=new JTextField();
		cityTextField.setFont(new Font("Raleway",Font.BOLD,14));
		cityTextField.setBounds(300, 490, 400, 30);
		add(cityTextField);
		
		JLabel seniorCitizen =new JLabel("Senior Citizen:");		
		seniorCitizen.setFont(new Font("Raleway",Font.BOLD,20));
		seniorCitizen.setBounds(100,540,200,30);
		add(seniorCitizen);
		syes= new JRadioButton("Yes");
		syes.setBounds(300,540,100,30);
		syes.setBackground(Color.WHITE);
		add(syes);
		sno= new JRadioButton("No");
		sno.setBounds(450,540,100,30);
		sno.setBackground(Color.WHITE);
		add(sno);
		ButtonGroup maritalgroup=new ButtonGroup();
		maritalgroup.add(syes);
		maritalgroup.add(sno);
		
		JLabel existAcc =new JLabel("Existing Account:");		
		existAcc.setFont(new Font("Raleway",Font.BOLD,20));
		existAcc.setBounds(100,590,200,30);
		add(existAcc);
		eyes= new JRadioButton("Yes");
	    eyes.setBounds(300,590,100,30);
		eyes.setBackground(Color.WHITE);
		add(eyes);
		eno= new JRadioButton("No");
		eno.setBounds(450,590,100,30);
		eno.setBackground(Color.WHITE);
		add(eno);
		ButtonGroup emaritalgroup=new ButtonGroup();
		emaritalgroup.add(syes);
		emaritalgroup.add(sno);
		
		next=new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(620,660,80,30);
		next.addActionListener(this);
		add(next);
		
		getContentPane().setBackground(Color.WHITE);
		
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String sreligion=(String)religion.getSelectedItem();
		String scategory= (String)category.getSelectedItem();
	    String sincome= (String)income.getSelectedItem();
	    String seducation= (String)education.getSelectedItem();
	    String soccupation= (String)occupation.getSelectedItem();
	    String sseniorcitizen=null;
	    if(syes.isSelected()) {
	    	sseniorcitizen="Yes";
	    }else if(sno.isSelected()) {
	    	sseniorcitizen="No";
	    }
	    String existingaccount=null;
	    if(eyes.isSelected()) {
	    	existingaccount="Yes";
	    }else if(eno.isSelected()) {
	    	existingaccount="No";
	    }
	    String span= addressTextField.getText();
	    String saddress=cityTextField.getText();
	    
	    try {
	    		Conn c=new Conn();
	    		String query="insert into signuptwo values('"+formno+"','"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saddress+"','"+sseniorcitizen+"','"+existingaccount+"')";
	    	    c.s.executeUpdate(query);
	    	    setVisible(false);
	    	    new SignUpThree(formno).setVisible(true);;
	    }catch(Exception e) {
	    	System.out.println(e);
	    }
	    
	}
	public static void main(String[] args) {
         new SignUpTwo("");
	}

}
