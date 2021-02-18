/**
 * 16M-OOP
 * 18 10 : 29
 */
public class RepeatFront {
    public static void main(String[] args) {
        System.out.println(repeatFront("Chocolate", 4)); //→ "ChocChoChC"
        System.out.println(repeatFront("Chocolate", 3)); //→ "ChoChC"
        System.out.println(repeatFront("Ice Cream", 2)); //→ "IcI"
    }

    private static String repeatFront(String str, int n) {
        String result = "";
        int countLetter = n;
        for (int i = 0; i < n; i++) {
            result += str.substring(0, countLetter);
            countLetter--;
        }
        return result;
    }
}
