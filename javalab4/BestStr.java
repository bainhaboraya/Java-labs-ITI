import java.util.function.BiPredicate;

public class BestStr {
    public static String bestStr(String str1, String str2, BiPredicate<String, String> biPredicate) {
        return biPredicate.test(str1, str2) ? str1 : str2;
    }

    public static void main(String[] args) {
        String str1 = "iti";
        String str2 = "Welcome";

        String longerString = bestStr(str1, str2, (s1, s2) -> s1.length() > s2.length());
        System.out.println("The Longest String is " + longerString);

        String firstString = bestStr(str1, str2, (s1, s2) -> true);
        System.out.println("The First String is " + firstString);
    }
}
