import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class WordCount {
    public static int countWords(String input) {
        String[] words = input.split("\\s+");
        Map<String, Integer> wordMap = new HashMap<>();

        for (String word : words) {
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }

        int totalCount = 0;
        for (int count : wordMap.values()) {
            totalCount += count;
        }

        return totalCount;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        int wordCount = countWords(input);

        System.out.println("Number of words in the string: " + wordCount);

        scanner.close();
    }
}
