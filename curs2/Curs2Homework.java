public class Curs2Homework{
	public static void main(String[] args){
		sumVariables();

	}
	public static void sumVariables(){
		int intVariable = 1;
		double doubleVariable = 2;
		short shortVariable = 3 ;
		long longVariable = 4;
		
		double sum = ( intVariable + doubleVariable + shortVariable +longVariable );
		System.out.println("Suma variabilelor este " +  sum);
	}
	
}