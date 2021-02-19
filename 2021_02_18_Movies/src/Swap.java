/**
 * 16M-OOP
 * 19 11 : 53
 */
public class Swap {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        int temp = a;
        a = b;
        b = temp;
        int[] myArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // значения пятый и шестой индекс поменять местами
        temp = myArray[6];
        myArray[6] = myArray[5];
        myArray[5] = temp;

        swapArray(myArray, 5, 6);
    }

    private static void swapArray(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
