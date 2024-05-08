public class Check {
    public static boolean Alphabet(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        if (args.length == 1) {
            String str1 = args[0];
            String message = Alphabet(str1) ?
                    " Only Alphabets" :
                    " nonAlphabetic Characters";

            System.out.println(message);
        } else {
            System.out.println("Please Enter an Argument to Check");
        }
    }
}