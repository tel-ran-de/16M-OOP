/**
 * 16M-OOP
 * 18 10 : 48
 */
public class ModThree {
    public static void main(String[] args) {
        int[] arr1 = {2, 1, 3, 5};
        int[] arr2 = {2, 1, 2, 5};
        int[] arr3 = {2, 4, 2, 5};

        System.out.println(modThree(arr1)); //→ true
        System.out.println(modThree(arr2)); //→ false
        System.out.println(modThree(arr3)); //→ true
    }

    private static boolean modThree(int[] input) {
        boolean result = false;
        for (int i = 1; i < input.length - 1; i++) {
            if (input[i - 1] % 2 == 0 && input[i] % 2 == 0 && input[i + 1] % 2 == 0) {
                result = true;
                break;
            }
            if (input[i - 1] % 2 != 0 && input[i] % 2 != 0 && input[i + 1] % 2 != 0) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static boolean modThreeSecond(int[] arr) {
        // думаю над решением
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
                countOdd = 0;
            }
            if (arr[i] % 2 != 0) {
                countOdd++;
                countEven = 0;
            }
            if (countEven > 2 || countOdd > 2) {
                return true;
            }
        }
        return false;
    }
}
