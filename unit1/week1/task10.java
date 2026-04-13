public class task10 {
    static String secondWordUpper(String str) {
        String[] words = str.split(" ");
        if (words.length < 2) return "LESS";
        return words[1].toUpperCase();
    }
    public static void main(String[] args) {
        System.out.println(secondWordUpper("Hello world example")); // expected WORLD
        System.out.println(secondWordUpper("One")); // expected LESS
    }
}