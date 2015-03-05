package Account;

import java.util.Date;


public class Test {
	
	private static int id = 1122;
	private static double balance = 20000;
	private static double annualInterest = 4.5;
	private static double withdraw = 2500;
	private static double deposit = 3000;	

	public static void main(String[] args) throws InsufficientFundsException {
		
		
		Account account = new Account(id, balance);
		account.withdraw(withdraw);
		double myAmt2 = account.deposit(deposit);
		account.setAnnualInterestRate(annualInterest);
		double myInt = account.getMonthlyInterestRate();
		
		Date date = new Date();			
				
		Account.setDateCreated(date);
		date = Account.getDateCreated();
		
		System.out.println("Your balance is: $"+ Double.toString(myAmt2) + "\n" + "Your monthly interest is: " +
		Double.toString(myInt) + "%" + "\n" + "Your account was created: " + date.toString());	
		
		Account testAccount = new Account(7347, 2000);
		testAccount.withdraw(2000.5);
		double testAmt = testAccount.deposit(0);
		testAccount.setAnnualInterestRate(5.0);
		double testInt = testAccount.getMonthlyInterestRate();
		
		Date testDate = new Date();			
				
		Account.setDateCreated(testDate);
		testDate = Account.getDateCreated();
		
		System.out.println("Your balance is: $"+ Double.toString(testAmt) + "\n" + "Your monthly interest is: " +
				Double.toString(testInt) + "%" + "\n" + "Your account was created: " + testDate.toString());
		
		

	}

	
	
	

}
