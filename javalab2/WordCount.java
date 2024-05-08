public class WordCount {
    public static void main(String[] args) {
        String sentence = "iti is the best place to teach IT.iti is the best place to teach IT.";
        String word = "iti";

        int count = 0;
        int index = sentence.indexOf(word);
        while (index != -1) {
            count++;
            index = sentence.indexOf(word, index + word.length());
        }

        System.out.println("Number of occurrences of the word '" + word + "': " + count);
    }
}