public class Main {
    public static void main(String[] args) {
        String input = "This is an example of even length words";
        String[] words = input.split("\\s+");

        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}
