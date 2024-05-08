import java.util.StringTokenizer;

public class WordTokenize {
    public static void main(String[] args) {
        String sentence = " iti is the best place to teach IT. iti is the best place to teach IT.";
        String word = "iti";

        StringTokenizer tokenizer = new StringTokenizer(sentence);
        int count = 0;

        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            if (token.equals(word)) {
                count++;
            }
        }

        System.out.println("Number of occurrences of the word '" + word + "': " + count);
    }
}