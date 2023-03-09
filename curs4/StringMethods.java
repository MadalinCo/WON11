public class StringMethods{
	public static void main(String[] args){
		String s = "un text";
		String str = new String("Ana are mere!");

		System.out.println(str.length());

		System.out.println(str.substring(4));
		System.out.println(str.substring(4,7));

		System.out.println(str.charAt(2) + str.charAt(3));

		char[] letters = str toCharArray();
		for(int i = 0,i <letters; i++)
	}
}