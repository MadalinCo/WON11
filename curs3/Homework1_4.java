import java.util.Scanner;

public class Homework1_4{
	
	public static void main(String[] args){
	

		irstEx();
		monthNumber();
		twoParameters();
		threeParameters();


	}
	public static void firstEx(){
		Scanner pewww = new Scanner(System.in);
		System.out.println("Enter a number:");
		byte byteParameter = pewww.nextByte();
		if (byteParameter > 10) {
			System.out.println("This number is greater than 10 :)");
		}

	}



	public static void monthNumber(){
		Scanner pewww = new Scanner(System.in);
		System.out.println("Enter a noumber of a month (1-12): ");
		int monthInt = pewww.nextInt();
		
		switch (monthInt) {
		case 1 ->
			System.out.println("Janary");
		case 2 ->
			System.out.println("February");
		case 3->
			System.out.println("March");
		case 4 -> 
			System.out.println("April");
		case 5 ->
			System.out.println("May");
		case 6 ->
			System.out.println("June");
		case 7 ->
			System.out.println("Julay");
		case 8 ->
			System.out.println("August");
		case 9 ->
			System.out.println("September");
		case 10 ->
			System.out.println("October");
		case 11 ->
			System.out.println("November");
		case 12 ->
			System.out.println("December");
		}
	}

	public static void twoParameters(){
		Scanner pewww = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = pewww.nextInt();
		System.out.println("I need a second number");
		int b = pewww.nextInt();
		
		if(a > b){
			System.out.println("Greater is first number :" + a);
		}
		else if(a < b){
			System.out.println("Greater is second number :" + b);
		}
		else if(a == b){
			System.out.println("Same number");
		}
		}

	public static void threeParameters(){
		Scanner pewww = new Scanner(System.in);
		System.out.println("Enter a number");
		int a = pewww.nextInt();
		System.out.println("I need a second number");
		int b = pewww.nextInt();
		System.out.println("I need a third number");
		int c = pewww.nextInt();
		
		if(a > b && a > c){
			System.out.println("Greater is first number :" + a);
		}
		else if(a < b && b > c){
			System.out.println("Greater is second number :" + b);
		}
		else if(b < c && c > a){
			System.out.println("Greater is second number :" + c);
		}
		

		}
		

	}




 
		
		
		
		
		
		
	

