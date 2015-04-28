package application;

import javax.swing.JButton;

import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent; 

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.text.DateFormatSymbols;
import java.util.Calendar;



public class Main extends Application {

	private JPasswordField PasswordField;
	private JLabel PasswordLbl;
	private JButton Ok;
	private JButton Help;
	private JFrame Messages;
	private String correctPassword = "bugaboo";

	public static void main(String[] args) {
		launch(args);
	}


	@Override
	public void start(Stage Stage) {
		PasswordLbl = new JLabel("Enter a password: ");
		PasswordField = new JPasswordField(10);
		Ok = new JButton("OK");
		Help = new JButton("Help");
		
				

		JFrame frame = new JFrame();
		frame.setSize(500, 200);
		frame.setLayout(new BorderLayout());   
		frame.setLocationRelativeTo(null);

		JPanel panel = new JPanel();

		frame.add(panel);
		
		

		panel.add(PasswordLbl);
		panel.add(PasswordField);
		
		panel.add(Ok);
		panel.add(Help);


		Ok.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				

				char [] passwordArr = PasswordField.getPassword();	

				String password = new String(passwordArr);
				
				if (password.equals(correctPassword)){
					JOptionPane.showMessageDialog(Messages,"Correct Password");
				}
				else{
					if (password != correctPassword){
						JOptionPane.showMessageDialog(Messages,"Incorrect Password Please Try Again");

					}
					
				}
			}
		});

		

		Help.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(Messages,"Help Was Clicked");



			}
		});





		//frame.pack();
		frame.setVisible(true); 




	}

	
//
//
//	protected void actionHandlerOk(String monthPicked, Integer y) {
//		// TODO Auto-generated method stub
//		//System.out.println(y);
//
//
//	}
















}