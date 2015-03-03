package Quiz2;

import java.util.Scanner;

public class TuitionCost {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Tuition Amount:");
		double tuition = input.nextDouble();
		System.out.println("Enter Percentage Increase:");
		double per_inc = input.nextDouble();
		double sum = tuition;
		
		for(int year = 0; year < 3; year++){			
			double dumb = tuition + (tuition * per_inc);
			tuition = dumb;
			sum = dumb + sum;
						
		}
		
		System.out.println(sum);
		

	}

}
