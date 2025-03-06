import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        String sentence = getSentenceInput(); 
        int wordCount = countWords(sentence); 
        displayWordCount(wordCount); 
    }
    public static String getSentenceInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        return scanner.nextLine();
    }
    public static int countWords(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        String[] words = sentence.split("\\s+"); 
        return words.length;
    }
    public static void displayWordCount(int wordCount) {
        System.out.println("The sentence has " + wordCount + " words.");
    }
}
