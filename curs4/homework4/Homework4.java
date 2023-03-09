import java.util.Scanner;

public class Homework4{
	public static void main(String[] args){
		getRandomNumber();
	}
	public static void arrayLine(){
		int array[] = {100,3,7,10,99};
		
		int sum = 0;
		for(int i=0; i<array.length; i++){
			sum=sum+array[i];
		}
		System.out.println("sum is " + sum);
	}
	public static void evenElements(){
		int a[] = {2, 3, 5, 8, 4};

		for(int i=0; i<a.length; i++){
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}
	}
	public static void arrayOfStrings(){
		String strings[] = {"Ionut", "Radu", "Andrei", "Matei", "Florin", "Stefan"};
		
				System.out.print(strings[0] + " " + strings[1] + " " + strings[2]);
		
	

	}
	public static void menuApp(){
		String s[] = {"Pizza", "Cheeseburger" , "Soup" , "Exit" };
		System.out.println("1) Pizza");
		System.out.println("2) Cheeseburger");
		System.out.println("3) Soup");
		System.out.println("4) Exit");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
			if (a == 1){
				while (a!= 4){
				System.out.println("You ordered Pizza. Thank you!");
					System.out.println("1) Pizza");
					System.out.println("2) Cheeseburger");
					System.out.println("3) Soup");
					System.out.println("4) Exit");
					a = sc.nextInt();
					
				} }
				
		
			
			else if (a == 2){
				while (a!= 4){
				System.out.println("You ordered Cheeseburger. Thank you!");
					System.out.println("1) Pizza");
					System.out.println("2) Cheeseburger");
					System.out.println("3) Soup");
					System.out.println("4) Exit");
					a = sc.nextInt();
			}}
			else if (a == 3){
				while (a!= 4){
				System.out.println("You ordered Soup. Thank you!");					System.out.println("1) Pizza");
					System.out.println("2) Cheeseburger");
					System.out.println("3) Soup");
					System.out.println("4) Exit");
					a = sc.nextInt();

		
			}}
			else if (a == 4){
				System.out.println("End of App!");
			}
			else if(a >4){
				while(a!=4){
					System.out.println("error, wrong choice!");
					System.out.println("1) Pizza");
					System.out.println("2) Cheeseburger");
					System.out.println("3) Soup");
					System.out.println("4) Exit");
					
					a = sc.nextInt();

				}
			}
		

	}
	public static void getRandomNumber(){
		System.out.println("Enter a number between 1-20:");
		Scanner scan = new Scanner(System.in);
		int chosenNumber = scan.nextInt();
		System.out.println(chosenNumber);
	}	
		
}		





	
