package cbat;

public class WordsCount {
	
	public int wordsCount(String[] words, int len) {
		int stringCounter = 0;
		for(String word : words) {
			if(word.length()==len)
				stringCounter++;
		}
		 return stringCounter;
	}
}
