public class Homework4S{
	public static void main(String[] args){
		returnCensored();
	}
	public static void specificCharCounter(){
		String s = "A venit primavara iar.";
		int totalNumberOfChar = s.length();
		int totalNumberOfCharMinusAChar = s.replace("a", "").length();
		int  count = totalNumberOfChar - totalNumberOfCharMinusAChar;
		System.out.println( "The specific char is in the string for "+  count );
	}
	public static void returnCensored(){
		String a = "eugenia";
		System.out.println(a.replaceAll("eugenia", "*******" ));
	}
}