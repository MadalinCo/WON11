public class Curs4Homework1{
	public static void main(String[] args){
		String[] sensitiveWords = {"mere" , "Ana"};
		System.out.println(confidential("Ana are multe mere bune" , sensitiveWords));

	}
	public static int countchar(String word, char c){
		char[] letters = word.toCharArray();
		int sum = 0;
		for (char letter: letters){
			if(letter==c){
				sum++;
			}
		}
		return sum;
	}
	public static String redact(String word){
		String result = "";
		for(int i= 0; i < word.length(); i++){
			result += "*";
		}
		return result;
	}
	public static boolean contains(String[] words, String word){
		for(String w: words){
			if(w.equals(word)){
				return true;
			}
		}
		return false;
	}
	public static String[] words (String phrase){
		return phrase.split(" ");

	}
	public static String confidential(String phrase, String[] sensitiveWords){
		String result = "";
		String[] words = words(phrase);
		for(String word: words){
			if(contains(sensitiveWords, word)){
				result+= redact(word);
			}
			else {
				result+= word;
			}
			result += " ";
		}
		return result.trim();
	}
}