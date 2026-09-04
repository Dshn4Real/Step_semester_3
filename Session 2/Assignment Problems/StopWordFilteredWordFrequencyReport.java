import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StopWordFilteredWordFrequencyReport {

    static void printFilteredWordFrequency(String feedback) {

        String[] stopWords = {
            "the", "was", "and", "a", "is", "of", "in"
        };

        feedback = feedback.toLowerCase();
        feedback = feedback.replace(".", "");
        feedback = feedback.replace(",", "");

        String[] words = feedback.split("\\s+");

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {

            boolean isStopWord = false;

            for (String stopWord : stopWords) {
                if (word.equals(stopWord)) {
                    isStopWord = true;
                    break;
                }
            }

            if (!isStopWord) {
                if (frequency.containsKey(word)) {
                    frequency.put(word, frequency.get(word) + 1);
                } else {
                    frequency.put(word, 1);
                }
            }
        }

        String[] uniqueWords = frequency.keySet().toArray(new String[0]);

        // Sort words by frequency in descending order
        for (int i = 0; i < uniqueWords.length - 1; i++) {
            for (int j = 0; j < uniqueWords.length - i - 1; j++) {

                if (frequency.get(uniqueWords[j]) <
                    frequency.get(uniqueWords[j + 1])) {

                    String temp = uniqueWords[j];
                    uniqueWords[j] = uniqueWords[j + 1];
                    uniqueWords[j + 1] = temp;
                }
            }
        }

        for (String word : uniqueWords) {
            System.out.println(word + ": " + frequency.get(word));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter feedback: ");
        String feedback = sc.nextLine();

        printFilteredWordFrequency(feedback);

        sc.close();
    }
}