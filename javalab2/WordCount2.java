public class WordCount {
    public static void main(String[] args) {
        String sentence = "iti is the best place to teach IT.iti is the best place to teach IT.";
        String word = "iti";

        String[] words = sentence.split("\\b");
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                count++;
            }
        }

        System.out.println("Number of occurrences of the word '" + word + "': " + count);
    }
}
