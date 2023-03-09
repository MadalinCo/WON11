public class Today{
	public static void main(String[] args){
		System.out.println(sumOfTwoNumbers(2, 3 ));
		System.out.println(daysOfSummer(30, 31, 31));
		System.out.println(freeDaysOfTheMonth(2, 3, 3, 2));
		int firstnumber = 22;
		int secondNumber = 38;
		System.out.println(sumOfTwoNumbers(firstnumber, secondNumber)); 
		array();
	}
	public static String sumOfTwoNumbers(int a, int b){
		return "suma este" + (a + b);
	}
	public static String daysOfSummer(int a, int b, int c){
		return "Vara are " + (a + b + c )+ " zile. :)" ;
	}
	public static String freeDaysOfTheMonth(int a, int b, int c, int d){
		return "Luna asta am avut " + (a + b + c + d) + "zile libere?";
	}
	public static void array(){
		char[] letters = new char[]{'a','b','c','d'};
		System.out.println  (letters[0]);
	}
}