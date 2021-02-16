/**
 * 16M-OOP
 * 16 10 : 59
 */
public class CocktailSort {
    public static void main(String[] args) {
        //int[] myTestArray = new int[20];
        int[] array = createArray(10);
        myPrint(array);
    }



    private static void myPrint(int[] array) {
        System.out.print("[ ");
        for (int i = 0; i < array.length -1; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println(array.length -1 + " ]");
    }

    private static int[] createArray(int size) {
        int[] output = new int[size];
        for (int i = 0; i < output.length; i++) {
            output[i] = (int)(Math.random()*100);
        }
        return output;
    }

}
