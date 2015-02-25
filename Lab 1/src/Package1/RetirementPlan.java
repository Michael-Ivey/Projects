package Package1;

/**Michael Ivey, Blackwell
 * This program calculates the monthly payment and total amount needed to be saved for a retirement 
 * that meets the criteria enter by the user. 
 */

import java.util.Scanner;

public class RetirementPlan {
	
	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Enter Expected Average Annual Return as a percentage between 0 and 20%:");	
	double annual_work = input.nextDouble();
	 while ((annual_work < 0) || (annual_work > 20)){
		System.out.println("Enter Expected Average Annual Return as a percentage between 0 and 20%:");
		annual_work = input.nextDouble();
		
	}
	
	System.out.println("How many years do you plan to Work?");
	int years_work = input.nextInt();
	
	System.out.println("How many years do you plan to draw Retirement?");
	int years_retired = input.nextInt();
	
	System.out.println("Enter Annual Return While in Payback Mode as a percentage between 0 and 3%: ");
	double annual_retire = input.nextDouble();
	while ((annual_retire < 0) || annual_retire > 3){
		System.out.println("Enter Annual Return While in Payback Mode as a percentage between 0 and 3%: ");
		annual_retire = input.nextDouble();
		
	}		
	
	System.out.println("How much money will you need to draw monthly while retired?");
	double retired_inc = input.nextDouble();
	
	System.out.println("How much SSI will you receive monthly?");
	double month_ssi = input.nextDouble();
	
	double pmt = retired_inc - month_ssi;
	double ret_rate = annual_retire / 1200;
	double bottom_value = 1 - Math.pow(1 + (ret_rate), -(years_retired * 12));	
	double work_rate = annual_work / 1200;
	
	
	double pv = (pmt * bottom_value) / (ret_rate);
	
	double monthly_pmt = (pv / (Math.pow(1 + (work_rate), (years_work * 12)))) * ((work_rate) / (1 - (Math.pow(1 + work_rate, -years_work*12))));
	
	double roundOff = Math.round(pv * 100.0) / 100.0;
	double roundOff2 = Math.round(monthly_pmt*100.0)/100.0;
	
	String str_pv = Double.toString(roundOff);
	String str_pmt = Double.toString(roundOff2);
		
	
	
	System.out.println("The amount need for your retirement plan is: $" + str_pv);
	System.out.println("You need to save $" + str_pmt + " per month to meet your retirement goal.");
	//System.out.println(roundOff);

	
	 
	
	}

}
