import java.util.Scanner;



public class ScannerH{
public static void main(String[] args){
	System.out.println("Enter a number between 15 and 17:");
	Scanner pew = new Scanner(System.in);

	int firstNumber = pew.nextInt();
	System.out.println("Enter a number between 4 and 6:");
	int secondNumber = pew.nextInt();
	System.out.println(firstNumber + " divided by " + secondNumber + " is " + firstNumber/secondNumber + " reminder " + firstNumber % secondNumber + ".");
	System.out.println("Thank you!");

}
}