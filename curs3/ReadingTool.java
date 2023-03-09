import java.util.Scanner;

public class ReadingTool{
	public static void main(String[] args){
		reading();

	}
	public static void reading(){
		System.out.println("What it is your income?");
		Scanner scan = new Scanner(System.in);
		int income = scan.nextInt();
		if(income<=2000){
			System.out.println(0);
		}
		else if(income <= 5000 && income > 2000){
			System.out.println("Your tax percent is " + (income / 20) + " and you remain with " + (income -(income/20)) + ".");
		}
		else if(income > 5000){
			System.out.println("Your tax percent is " + (income / 25) + " and you remain with " + (income -(income/25)) + ".");
		}
		

	}
}