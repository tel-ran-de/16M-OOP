package exercise;

/**
 * 16M-OOP
 * 02 10 : 49
 */
public class Solution {
    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public String nonStart(String s1, String s2) {
        return s1.substring(1) + s2.substring(1);
    }
}
