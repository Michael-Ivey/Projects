package application;
	
import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.ToggleGroup;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.util.Calendar;

import application.Person;



public class Main extends Application {
	
	private String gender;
	private JFrame Messages;

	
	
	
	
	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage Stage) throws ParseException {
		
		String[] states = {" ","Alabama","Alaska","Arizona","Arkansas","California","Colorado","Connecticut","Delaware","Florida","Georgia","Hawaii","Idaho","Illinois","Indiana","Iowa","Kansas","Kentucky","Louisiana","Maine","Maryland","Massachusetts","Michigan","Minnesota","Mississippi","Missouri","Montana","Nebraska","Nevada","New Hampshire","New Jersey","New Mexico","New York","North Carolina","North Dakota","Ohio","Oklahoma","Oregon","Pennsylvania","Rhode Island","South Carolina","South Dakota","Tennessee","Texas","Utah","Vermont","Virginia","Washington","West Virginia","Wisconsin","Wyoming"};
		JTextField FirstNameFld = new JTextField(10);
		JLabel FirstNameLbl = new JLabel("First Name");
		
		JTextField MiddleNameFld = new JTextField(1);
		JLabel MiddleNameLbl = new JLabel("Middle Initial");
		
		JTextField LastNameFld = new JTextField(10);
		JLabel LastNameLbl = new JLabel("Last Name");
		
		JTextField AddressFld = new JTextField(10);
		JLabel AddressLbl = new JLabel("Address");
		
		JTextField CityFld = new JTextField(10);
		JLabel CityLbl = new JLabel("City");
		
		JComboBox stateBox = new JComboBox();
		JLabel stateLbl = new JLabel("State");		
		
		JTextField ZipFld = new JTextField(9);
		JLabel ZipLbl = new JLabel("Zip Code");
		
		JRadioButton maleBtn = new JRadioButton("Male");
		JRadioButton femaleBtn = new JRadioButton("Female");	
		
		JButton saveBtn = new JButton("Save");
		JButton clearBtn = new JButton("Clear");
		
		
		
		for(int i=0; i<50;i++){
			stateBox.addItem(states[i]);
		}		
		

		
		JFrame frame = new JFrame();
		frame.setSize(700, 600);
		frame.setLayout(new FlowLayout());   
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();	
		
		frame.add(panel);
		
		panel.add(FirstNameLbl);
		panel.add(FirstNameFld);
		panel.add(MiddleNameLbl);
		panel.add(MiddleNameFld);
		panel.add(LastNameLbl);
		panel.add(LastNameFld);
		panel.add(AddressLbl);
		panel.add(AddressFld);
		panel.add(AddressFld);
		panel.add(CityLbl);
		panel.add(CityFld);
		panel.add(stateLbl);
		panel.add(stateBox);
		panel.add(ZipLbl);
		panel.add(ZipFld);
		panel.add(maleBtn);
		panel.add(femaleBtn);
		panel.add(saveBtn);
		panel.add(clearBtn);		
		
		

		saveBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String gender;

				boolean flag = validateInput(FirstNameFld.getText().length(), LastNameFld.getText().length() 
						, MiddleNameFld.getText().length(), AddressFld.getText().length(),ZipFld.getText().length(), maleBtn.isSelected(), 
						femaleBtn.isSelected(), stateBox.getSelectedIndex(), ZipFld.getText());
				if (maleBtn.isSelected() && true){
					gender = "M";
					setGender(gender);
				}
				else if (femaleBtn.isSelected() && true){
					gender = "F";
					setGender(gender);
					
				}
				
				if (flag && true){
					Person person = new Person(FirstNameFld.getText(), MiddleNameFld.getText(), LastNameFld.getText(), 
							AddressFld.getText(), CityFld.getText(), stateBox.getSelectedItem().toString(), ZipFld.getText(), getGender());
				}


			}
			
			

			
			});
		
		
		
		clearBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				FirstNameFld.setText("");
				LastNameFld.setText("");
				MiddleNameFld.setText("");
				AddressFld.setText("");
				CityFld.setText("");
				ZipFld.setText("");
				stateBox.setSelectedItem(" ");
				maleBtn.setSelected(false);
				femaleBtn.setSelected(false);
				
				
				


			}
		});
		
		maleBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				
				femaleBtn.setSelected(false);		
				
				


			}
		});
		
		femaleBtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				
				maleBtn.setSelected(false);		
				
				


			}
		});		
		
		
		
		
		
		
	
	    frame.setVisible(true); 
		

	

		


		
		}
	
	public static boolean isNumeric(String zip)  
	{  
	  try  
	  {  
	    int d = Integer.parseInt(zip);  
	  }  
	  catch(NumberFormatException nfe)  
	  {  
	    return false;  
	  }  
	  return true;  
	}


	protected boolean validateInput(int Fname, int Lname, int Mname, int Add, int zip, boolean male, boolean female, int state, String zipInt) {
		// TODO Auto-generated method stub
		
		
		
		boolean value = isNumeric(zipInt);
        
		
		
		
		
		 

		if ((Fname <= 50) && (Lname <= 50) && (Mname <= 1) && (Add <= 50) && ((zip == 5) || (zip == 9)) && (male || female) &&
				(state > 0) && (value && true))  {
			JOptionPane.showMessageDialog(Messages,"Successful Save");
			return true;
					
		}
		JOptionPane.showMessageDialog(Messages,"Invalid Input. Please Try Again");
		return false;
		
	}
	



			


		
			
		
		

		

		


	}
	


	


