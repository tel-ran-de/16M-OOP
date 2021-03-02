package lessonStart;

/**
 * 16M-OOP
 * 02 10 : 41
 */
public class String02Solution {

    /**
     * out string length 4.
     *
     * @param out
     * @param word
     * @return
     */
    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2);
    }
}
