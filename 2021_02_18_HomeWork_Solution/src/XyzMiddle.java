/**
 * 16M-OOP
 * 18 10 : 38
 */
public class XyzMiddle {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB")); //→ true
        System.out.println(xyzMiddle("AxyzBB")); //→ true
        System.out.println(xyzMiddle("AxyzBBB")); //→ false
        System.out.println(xyzMiddle("AxyzxyzBBB")); //→
    }

    private static boolean xyzMiddle(String word) {

        for (int i = 0; i < word.length() - 2; i++) {
            if (word.startsWith("xyz", i)) {
                int leftNumber = i;
                int rightNumber = word.length() - (i + 3);
                if (rightNumber -leftNumber <= 1) {
                    return true;
                }
            }
        }
        return false;
    }
}
