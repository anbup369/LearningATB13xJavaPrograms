package Interview_coding_Q;


public class AnagramGenerator {
    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Anagrams of \"" + input + "\":");
        generateAnagrams(input, "");
    }

    public static void generateAnagrams(String str, String prefix) {
        if (str.length() == 0) {
            System.out.println(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                String remaining = str.substring(0, i) + str.substring(i + 1);
                generateAnagrams(remaining, prefix + str.charAt(i));
            }
        }
    }
}