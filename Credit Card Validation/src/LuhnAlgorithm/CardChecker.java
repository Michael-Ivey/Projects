package LuhnAlgorithm;
//Michael Ivey

import java.util.Scanner;

public class CardChecker {
	
	private String cardNum;
	private static char[] charArray;
	
	

	public String getCardNum() {
		return cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public char[] getCharArray() {
		return charArray;
	}

	public void setCharArray(char[] charArray) {
		this.charArray = charArray;
	}
	public static char[] stringToArray(char [] charArray){
		char[] charArray2 = new char[10];
		int i = 0;
		while(i < 10){
			charArray2[i] = charArray[i+6];
			//System.out.println(charArray2[i]);
			i++;			
		}
		return charArray2;
		
	}
	
	public static int sumOfEven(char [] charArray2){
		
		int i = 8;
		int sumEven = 0;		
		while(i >= 0){				
			
			if (charArray2[i] >= '5'){
				sumEven = (int) (1 + (((charArray2[i] - 48) * 2) % 10) + sumEven);
				//System.out.println(charArray2[i]);			
				
				i = i - 2;
				//System.out.println(i);
			}
			else if((charArray2[i] > '0') && (charArray2[i] <= '4')){
				sumEven = (int) (sumEven + ((charArray2[i] - 48) * 2));
				//System.out.println(charArray2[i]);
				//System.out.println("1 to 4 range");
				//System.out.println(sum);
				i = i - 2;
			}
			else if(charArray2[i] == '0'){
				//System.out.println(charArray2[i]);
				//System.out.println("0 range");
				i = i - 2;
				
			}
			
			
			
		}
		return sumEven;				
		
	}
	
	public static int sumOfOdd(char [] charArray2){
		
		int i = 7;
		int sumOdd = 0;
		while(i >= 0){
			sumOdd = sumOdd + (charArray2[i] - 48);
			i = i - 2;
		}
		return sumOdd;
		
		
	}
	
	public static boolean isValid(int finalSum){
		
		if ((finalSum % 10) == 0){
			System.out.println("Card number is Valid!");
			return true;
		}
		else{
			System.out.println("Card number is Invalid!");
			return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int finalSum = 0;
		CardChecker creditCard = new CardChecker();
		System.out.println("Enter a credit card number: ");
		Scanner input = new Scanner(System.in);
		String cardNum = input.nextLine();
		creditCard.setCardNum(cardNum);
		char[] charArray = cardNum.toCharArray();
		//System.out.println(cardNum);
		char[] charArray2 = stringToArray(charArray);		

		int sumEven = sumOfEven(charArray2);
		//System.out.println(sumEven);
		
		int sumOdd = sumOfOdd(charArray2);
		

		finalSum = sumEven + sumOdd;
		//System.out.println(finalSum);
		
		isValid(finalSum);
		
	
		
		
		

	}

}
