package Account;

//Michael Ivey PS3

import java.util.Date;


public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private static Date dateCreated;
	
	
	public Account() {
		
		this.id = getId();
		this.balance = getBalance();
		
	}
	
	public Account(int id, double balance) {
		setId(id);
		setBalance(balance);
		
		
	}
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	

	
	public double getMonthlyInterestRate(){
		
		double monthlyInterestRate = this.annualInterestRate / 12;
		
		return monthlyInterestRate;
		
	}
	
	public double withdraw(double withdraw)throws InsufficientFundsException
	{
		double myBalance = this.balance;
		if (myBalance >= withdraw){
			this.balance = myBalance - withdraw;		
			return this.balance;			
		}		
		else
	      {
	         double diff = withdraw - this.balance;
	         throw new InsufficientFundsException(diff); 
	      }
		
	}
	
	public double deposit(double deposit){
		double myBalance = this.balance;
		this.balance = myBalance + deposit;		
		return this.balance;	
		}

	public static Date getDateCreated() {
		return dateCreated;
	}

	public static void setDateCreated(Date date) {
		dateCreated = date;
	}
	

	

	

}
