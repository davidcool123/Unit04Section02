import java.util.HashMap;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> wordCount = new HashMap<>();
        System.out.println("Enter words (type 'exit' to stop):");

        while (scanner.hasNext()) {
            String word = scanner.next().toLowerCase();
            if (word.equals("exit")) {
                break;
            }
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        scanner.close();

        System.out.println("Word Count:");
        for (var entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
