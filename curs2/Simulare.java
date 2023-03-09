public class Simulare{
	public static void main(String[] args){
		sumVariables();
	}
	public static void sumVariables(){
		int a = 2;
		double b = 3.91;
		short c = 100;
		long d = 4;

		double sum = a + b +c + d;

		double multiplicareDeRezultat = sum*2;

		System.out.println("Rezultatul  este " + sum +  "si dublul este " +  multiplicareDeRezultat + "si " + sum/2 + "este jumatate" );
	}
}