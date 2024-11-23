public class Main {
    public static void main(String[] args) {
        String input = "Hello, this is a simple Java program.";
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);
    }

    public static int countWords(String str) {
        str = str.trim();
        if (str.isEmpty()) {
            return 0;
        }
        String[] words = str.split("\\s+");
        return words.length;
    }
}
