import java.util.Scanner;


public class ATMApp{
	public static void main(String[] args){
		int pin = 1234;
		int ballance = 600;
		atmMessages();
	}
	public static void atmMessages(){
		System.out.println("Insert the pin");
		Scanner scan = new Scanner(System.in);
		int ballance = 600;
		int pinDemanded = scan.nextInt();
		if(pinDemanded == 1234){
			

			System.out.println("The pin has been successfully introduced, what amount you want to withdraw?");
			int drawnAmount  = scan.nextInt();
			if (drawnAmount <= 600){
				System.out.println("You withdrawn " + drawnAmount + " in CASH" + ", your ballance is " + (600 - drawnAmount) );
			}
			else if(drawnAmount > 600){
				System.out.println("You don't have enough money in your account. Current ballance is " + ballance );
			}
		}
		else if(pinDemanded != 1234){
			System.out.println("The pin is incorrect, epic fail!");

		}

	}

	}