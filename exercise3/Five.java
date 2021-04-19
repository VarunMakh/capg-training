package exercise3;

public class Five {

	public static void main(String[] args) {
		int i = 0;
		int wordCount = 0;
		int lineCount = 0;
		int charCount = 0;
		int flag = 0;
		String sentence = new String("Hello\nMy name is Varun\nLet's count the number of words, lines and characters in this paragraph!");
		while(i < sentence.length()) {
			if(sentence.charAt(i) == ' ' || sentence.charAt(i) == '\n' || sentence.charAt(i) == '\t'){
				flag = 0;
			}
			else {
				charCount++;
			}
			if(sentence.charAt(i) == '\n') {
				lineCount++;
			}
			if(flag == 0) {
				flag = 1;
				wordCount++;
			}
			i++;
		}
		lineCount++;
		System.out.println(sentence);
		System.out.println("Character Count: " + charCount);
		System.out.println("Word Count: " + wordCount);
		System.out.println("Line Count: " + lineCount);
	}
	
}
