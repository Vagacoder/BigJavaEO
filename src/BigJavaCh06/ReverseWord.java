<<<<<<< HEAD
package BigJavaCh06;

public class ReverseWord {
	
	private String word;
	private String outputWord;
	
	public ReverseWord(String input) {
		
		word = input;
		outputWord = "";
	}
	
	public String getReversedWord() {
		
		for (int i = word.length()-1; i >= 0; i --)
		{
			outputWord += word.charAt(i);
		}
		
		return outputWord;
	}
}

=======
package BigJavaCh06;

public class ReverseWord {
	
	private String word;
	private String outputWord;
	
	public ReverseWord(String input) {
		
		word = input;
		outputWord = "";
	}
	
	public String getReversedWord() {
		
		for (int i = word.length()-1; i >= 0; i --)
		{
			outputWord += word.charAt(i);
		}
		
		return outputWord;
	}
}

>>>>>>> efb862a39d74bd6e20b068b8961126c091cec98a
