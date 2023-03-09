import java.util.Scanner;
import java.util.Random;

public class Demo{
	public static void main(String[] args){
		menuApp();

	}
	public static void randomnumber(){
		int rdm;
		rdm = new Random().nextInt(10+1);
		System.out.println(rdm);
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		

	}

	public static void menuApp(){
		String s[] = {"Pizza", "Cheeseburger" , "Soup" , "Exit" };
		System.out.println("1)" + s[0]);
		System.out.println("2)" + s[1]);
		System.out.println("3)" + s[2]);
		System.out.println("4)" + s[3]);
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		for (String element: s){
			System.out.println(element);
		}
		
		while(a <=4){
			if(a == 1){
			System.out.println("You ordered Pizza. Thank you!");
			}		
			a = scan.nextInt();
		}

	}

}