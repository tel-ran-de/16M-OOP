/**
 * 16M-OOP
 * 18 11 : 05
 */
public class SameEndsSolution {
    public static void main(String[] args) {
        int[] arr = {5, 6, 45, 99, 13, 5, 6}; // [] []
        int[] arr2 = {1, 2, 3, 4, 1, 2, 3, 4};
        System.out.println(sameEnds(arr, 1)); //→ false
        System.out.println(sameEnds(arr, 2)); //→ true
        System.out.println(sameEnds(arr, 3)); //→ false
        System.out.println(sameEnds(arr, 0)); //→  true
        System.out.println(sameEnds(arr2, 4)); //→  true
        System.out.println(sameEnds(new int[]{1, 6, 45, 99, 13, 5, 1}, 1)); // true
    }

    private static boolean sameEnds(int[] input, int n) {
        boolean result = true;
        for (int i = 0; i < n; i++) {
            if (input[i] != input[((input.length - n) + i)]) {
                result = false;
                break;
            }
        }
        return result;
    }
}
/*
    // [1,2,3]
    public static boolean compareTwoArrays(int[] a, int[] b){
        boolean result = false;
        return result;
    }*/