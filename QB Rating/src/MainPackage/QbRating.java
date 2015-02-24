package MainPackage;

// Michael Ivey

// This is a program that calculates the QB's NFL Passer Rating


import java.util.Scanner;

public class QbRating {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of touchdowns thrown by quarterback");
		double tds = input.nextDouble();
		
		System.out.println("Enter the number of completions thrown by quarterback");
		double complete = input.nextDouble();
		
		System.out.println("Enter the number of attempts thrown by quarterback");
		double attempts = input.nextDouble();
		
		System.out.println("Enter the number of interceptions thrown by quarterback");
		double picks = input.nextDouble();		
		
		System.out.println("Enter the total amount of passing yards thrown by quarterback");
		double yards = input.nextDouble();
		
		double a = ((complete / attempts) - .3) * 5;
		
		double b = ((yards / attempts) - 3) *.25;
				
		double c = (tds / attempts) *20;
		
		double d = 2.375 - ((picks / attempts) * 25);
		
		double passer_rating = ((a + b + c + d) / 6) * 100;
		
		if (passer_rating > 158.3){
			passer_rating = 158.3;
		}
		if (passer_rating < 0){
			passer_rating = 0;
		}
		
		System.out.println("The quarterback's passer rating is: " + String.format("%.1f", passer_rating)); 
		
	}

}
