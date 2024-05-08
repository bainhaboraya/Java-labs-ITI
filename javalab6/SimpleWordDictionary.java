import java.util.*;

public class SimpleWordDictionary {
    private Map<Character, List<String>> words;

    public SimpleWordDictionary() {
        words = new TreeMap<>();
    }

    public void addWord(String word) {
        if (word.length() > 0) {
            char firstLetter = Character.toLowerCase(word.charAt(0));
            words.computeIfAbsent(firstLetter, k -> new ArrayList<>())
                    .add(word);
            words.get(firstLetter).sort(Comparator.naturalOrder());
        }
    }

    public void printAllLettersAndWords() {
        words.forEach((letter, wordList) ->
                System.out.println(letter + ": " + wordList));
    }

    public void printWordsOfLetter(char letter) {
        letter = Character.toLowerCase(letter);
        List<String> wordList = words.get(letter);
        if (wordList != null) {
            System.out.println(letter + ": " + wordList);
        } else {
            System.out.println("No words found for letter " + letter);
        }
    }

    public static void main(String[] args) {
        SimpleWordDictionary dictionary = new SimpleWordDictionary();
        dictionary.addWord("Ahmed");
dictionary.addWord("Ali");
        dictionary.addWord("Bainh");
        dictionary.addWord("Carl");
        dictionary.addWord("Doha");
        dictionary.addWord("Eman");
        dictionary.addWord("Faten");
        dictionary.addWord("Gege");

        dictionary.printAllLettersAndWords();
        System.out.println();
        dictionary.printWordsOfLetter('A');
    }
}