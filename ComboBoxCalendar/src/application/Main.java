package application;
	
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormatSymbols;
import java.util.Calendar;



public class Main extends Application {
	
	
	JComboBox monthBox;
	JLabel month;
	
	JComboBox dayBox;
	JLabel day;
	
	JComboBox yearBox;
	JLabel year;
	
	public static void main(String[] args) {
		launch(args);
	}
	
	
	@Override
	public void start(Stage Stage) {
		
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August","September", "October","November","December"};
		
		Calendar cal = Calendar.getInstance();
		int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
		int currentYear = cal.get(Calendar.YEAR);
		int currentMonth = cal.get(Calendar.MONTH);
		String currentMonth1 = " ";
		
		if (currentMonth == 1){
			currentMonth1 = "January";			
		}else if (currentMonth == 2){
			currentMonth1 = "February";
		}else if (currentMonth == 3){
			currentMonth1 = "March";
		}else if (currentMonth == 4){
			currentMonth1 = "April";
		}else if (currentMonth == 5){
			currentMonth1 = "May";
		}else if (currentMonth == 6){
			currentMonth1 = "June";
		}else if (currentMonth == 7){
			currentMonth1 = "July";
		}else if (currentMonth == 8){
			currentMonth1 = "August";
		}else if (currentMonth == 9){
			currentMonth1 = "September";
		}else if (currentMonth == 10){
			currentMonth1 = "October";
		}else if (currentMonth == 11){
			currentMonth1 = "November";
		}else {
			currentMonth1 = "December";
			} 
		
		month = new JLabel("Month");
		monthBox = new JComboBox();
		for(int i=0; i<12;i++){
			monthBox.addItem(months[i]);
		}
		monthBox.setSelectedItem(currentMonth1);			
	
		
		day = new JLabel("Day");
		dayBox = new JComboBox();
		Integer[] days = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28};
		for(int i=1; i<31; i++){
            dayBox.addItem(i);
       }
		
		dayBox.setSelectedItem(dayOfMonth);
		
		
		year = new JLabel("Year");
		yearBox = new JComboBox();
		for(int i = 2009; i <= 2019; i++){
            yearBox.addItem(i);

		}
		yearBox.setSelectedItem(currentYear);	
		
		
		month.setLocation(38,25);
		monthBox.setLocation(78,25);
		
		
		day.setLocation(38,55);
		dayBox.setLocation(78,55);
		
		year.setLocation(38,85);
		yearBox.setLocation(78,85);
		
		JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout());
	    
		
		JPanel panel = new JPanel();	
		
		frame.add(panel);
		
		panel.add(month);
		panel.add(monthBox);
		
		panel.add(day);
		panel.add(dayBox);
		
		panel.add(year);
		panel.add(yearBox);

		monthBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String monthPicked = (String) monthBox.getSelectedItem();
				Integer y = (Integer) yearBox.getSelectedItem();
				actionHandlerMonth(monthPicked, y);


			}
		});
		
		yearBox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String monthPicked = (String) monthBox.getSelectedItem();
				Integer y = (Integer) yearBox.getSelectedItem();
				actionHandlerYear(monthPicked, y);


			}
		});
		
		
		
		
		
		frame.pack();
	    frame.setVisible(true); 
		

	

		


		
		}
	
	protected void actionHandlerYear(String monthPicked, Integer y) {
		// TODO Auto-generated method stub
		//System.out.println(y);

		if (monthPicked == "February"){
			if ((y == 2012) || (y == 2016)){
				if (dayBox.getItemCount() == 28){
					dayBox.addItem(29);
				}

			}
			else if((y != 2012) || (y != 2016)){
				if (dayBox.getItemCount() == 29){
					dayBox.removeItemAt(28);
				}

			}
			
		}


		
	}


	protected void actionHandlerMonth(String monthPicked, Integer y) {
		// TODO Auto-generated method stub
		
		if ((monthPicked == "April") || (monthPicked == "June") || (monthPicked == "September") || (monthPicked == "November"))
		{
			if((dayBox.getItemCount() == 31)){
				dayBox.removeItemAt(30);
				System.out.println(dayBox.getItemCount());

			}
			else if(dayBox.getItemCount() == 28){
				for(int i=29; i<30; i++){
					dayBox.addItem(i);	
				} 															
								
			}

		} 
		else if((monthPicked == "January") || (monthPicked == "March") || (monthPicked == "May") || (monthPicked == "July")|| 
				(monthPicked == "August") || (monthPicked == "October")|| (monthPicked == "December")){
			if(dayBox.getItemCount() == 29){
				dayBox.addItem(30);
				dayBox.addItem(31);
			}
			else if (dayBox.getItemCount() == 28){
				for(int i=29; i<31; i++){
					dayBox.addItem(i);
				}
			
			}else if (dayBox.getItemCount() == 30){
				dayBox.addItem(31);
				
			}
			
		}
		else if (monthPicked == "February"){
			
			if ((y == 2012) || (y == 2016)){
				if(dayBox.getItemCount() == 31){
					dayBox.removeItemAt(30);
					dayBox.removeItemAt(29);						
				}
				else if(dayBox.getItemCount() == 30){
					dayBox.removeItemAt(29);
				}
				else if(dayBox.getItemCount() == 28){
					dayBox.addItem(29);
				}
				
				
			}
			else 
				if(dayBox.getItemCount() == 31){
					dayBox.removeItemAt(30);
					dayBox.removeItemAt(29);
					dayBox.removeItemAt(28);

				}
				else if(dayBox.getItemCount() == 30){
					dayBox.removeItemAt(29);
					dayBox.removeItemAt(28);
				}
				else if(dayBox.getItemCount() == 29){
					dayBox.removeItemAt(28);

				}
		}
		
	}
			
			


		
			
		
		

		

		


	}
	


	


