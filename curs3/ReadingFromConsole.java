import java.util.Scanner;

public class ReadingFromConsole{
	public static void main(String[] args){
		System.out.println("welcome!");
		Scanner scanner = new Scanner(System.in);

		/*System.out.println("Introduceti 2 numere intregi");
		int intValue = scanner.nextInt();
		int anotherValue = scanner.nextInt();
		System.out.println("Valorile citite sunt:" + intValue + "si" + anotherValue);
		
		System.out.println("Introduceti 2 numere intregi ");*/
		System.out.println("Introduceti text");
		String text = scanner.nextLine();
		System.out.println("am citit:");
		System.out.println(text);

		System.out.println("introduceti un boolean");
		boolean boolValue = scanner.nextBoolean();
		System.out.println(boolValue);

	}
}