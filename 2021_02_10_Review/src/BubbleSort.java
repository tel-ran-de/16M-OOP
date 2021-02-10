import java.util.Arrays;

/**
 * 16M-OOP
 * 10 10 : 31
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] myLovelyArray = generateArray(10);
        int[] myCopyFromLovelyArray = copyMyArray(myLovelyArray);
        System.out.println(Arrays.toString(myLovelyArray));
        bSort(myLovelyArray);
        System.out.println(Arrays.toString(myLovelyArray));
    }

    private static int[] copyMyArray(int[] myLovelyArray) {



    }

    private static void bSort(int[] input) {
        boolean unsorted = true;
        while (unsorted) {
            unsorted = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i + 1]) {
                    swap(input, i);
                    unsorted = true;
                }
            }
        }
    }

    private static void swap(int[] input, int i) {
        int temp = input[i];
        input[i] = input[i + 1];
        input[i + 1] = temp;
    }

    private static int[] generateArray(int size) {
        int[] output = new int[size];
        for (int i = 0; i < output.length; i++) {
            output[i] = randomIntGenerate();
        }
        return output;
    }

    private static int randomIntGenerate() {
        return (int) (Math.random() * 100);
    }
}
