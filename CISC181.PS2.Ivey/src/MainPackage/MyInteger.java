package MainPackage;

//Michael Ivey PS2

public class MyInteger {
	
	private int value;
	
	MyInteger(int a){
		this.value = a;
		
	}	
	
	public int getValue(){
		return this.value;
	}		
	
	
	boolean isEven(){

		if ((this.value % 2) == 0) {
			System.out.println("T");
			return true;			
		} else 
			System.out.println("F");
			return false;		
	}
	
	boolean isOdd(){

		if ((this.value % 2) != 0) {
			System.out.println("T");
			return true;			
		} else 
			System.out.println("F");
			return false;		

	}
	
	boolean isPrime(){
		int j = 2;
		int flag = 0;
		int count = 0;
		



		while (j <= this.value / 2)
		{
			if (this.value % j == 0)
			{
				count = 1;
			}
			j++;
		}
		if (count == 1)
		{
			System.out.println("f");
			return false;
		}
		else
		{
			System.out.println("t");
			return true;
		}

	}
	
	static boolean isEven(int value){

		if ((value % 2) == 0) {
			System.out.println("t");
			return true;		
		} else 
			System.out.println("f");
			return false;

	}

	static boolean isOdd(int value){
		if ((value % 2) != 0) {
			System.out.println("t");
			return true;			
		} else 
			System.out.println("f");
			return false;

	}

	static boolean isPrime(int value){
		int j = 2;
		int flag = 0;

		while (j <= value / 2)
		{
			if (value % j == 0)
			{
				flag = 1;
			}
			j++;
		}
		if (flag == 1)
		{
			System.out.println("f");
			return false;
		}
		else
		{
			System.out.println("t");
			return true;
		}

	}

	static boolean isEven(MyInteger num){

		if ((num.value % 2) == 0) {
			System.out.println("t");
			return true;		
		} else 
			System.out.println("f");
			return false;

	}

	static boolean isOdd(MyInteger num){
		if ((num.value % 2) != 0) {
			System.out.println("t");
			return true;			
		} else 
			System.out.println("f");
			return false;

	}

	static boolean isPrime(MyInteger num){
		int j = 2;
		int flag = 0;

		while (j <= num.value / 2)
		{
			if (num.value % j == 0)
			{
				flag = 1;
			}
			j++;
		}
		if (flag == 1)
		{
			System.out.println("f");
			return false;
		}
		else
		{
			System.out.println("t");
			return true;
		}

	}
	
	boolean equals(int value){
		if (value == this.value){
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean equals(MyInteger num){
		if (num.value == this.value){
			return true;
		}
		else {
			return false;
		}
	}
	
	static int parseInt(char[] array){
		
		String nums = ""; 
		int my_num;
		String garb;
		int i;
		char accum;
		
		for (i = 0; i < array.length; i++){
			accum = array[i];
			garb = Character.toString(accum);
			nums = nums + garb;
			
		}
		
		my_num = Integer.parseInt(nums);
		
		System.out.println(my_num);
		
		return my_num;
	}
	
	static int parseInt(String str){
		
		int my_num;
		
		my_num = Integer.parseInt(str);
		
		System.out.println(my_num);
		
		return my_num;
	}
		
	
	

	
	public static void main(String[] args){			
		
				
		MyInteger.isOdd(47);
		MyInteger.isEven(47);
		MyInteger.isPrime(47);
		
		//int value1 = MyInteger.getValue();
		
		MyInteger x = new MyInteger((int) 47);
		int y = x.getValue();
		
		x.isOdd();
		x.isEven();
		x.isPrime();
		
		MyInteger z = new MyInteger((int) 55);
		z.isEven();
		z.isOdd();
		z.isPrime();
		
		String vector = "123456789";		
		parseInt(vector);
		
		
		
		
		
	
	}
}

