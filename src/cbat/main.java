package cbat;

import java.util.Arrays;

public class main {

	public static void main(String[] args) {
		
		WordsCount wordsCount = new WordsCount();
		WordsFront wordsFront = new WordsFront();
		GreenTicket greenTicket = new GreenTicket();
		
		String[] arrayCount = {"xx", "yyy", "x", "yy", "z"};
		String[] arrayFront = {"a", "b", "c", "d"};
		
		System.out.println(wordsCount.wordsCount(arrayCount, 2));
		System.out.println(Arrays.toString(wordsFront.wordsFront(arrayFront, 2)));
		System.out.println(greenTicket.greenTicket(2,2,2));
	}

}
