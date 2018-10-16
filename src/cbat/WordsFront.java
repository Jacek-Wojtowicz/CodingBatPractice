package cbat;

import java.util.Arrays;

public class WordsFront {
	
	public String[] wordsFront(String[] words, int n) {
		return Arrays.copyOfRange(words, 0, n);
	}
}
