public class Occurrences {
	public static int occurrencesIn(String word, char ch) {
		int check = 0;
		for(int count = 0; count < word.length(); count++) {
			if(ch == word.toLowerCase().charAt(count)) {
				check++;
			}
		}
		return check;
	}
}