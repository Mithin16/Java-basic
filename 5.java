public class Main {
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = " Java";
        int position = 5;

        str1 = str1.substring(0, position) + str2 + str1.substring(position);

        System.out.println(str1);
    }
}
