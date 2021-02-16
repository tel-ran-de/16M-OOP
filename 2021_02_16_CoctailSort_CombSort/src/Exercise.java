/**
 * 16M-OOP
 * 16 12 : 00
 */
public class Exercise {
    public static void main(String[] args) {
        int[] newArray = CocktailSort.createArray(10);
        int[] secondArray = new int[]{100, 5, 36, 56, 90, 3, 5, 68};
        int[] defaultArray = new int[10];

        int[] idealArray = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        unSortArray(idealArray);
    }

    private static void unSortArray(int[] idealArray) {
        // у нас есть отсортированный массив
        // надо его перемешать рандомно
        // Создадим новый массив той же длины
        // В него мы будем переписывать данные
        // По исходному массиву мы идём циклом
        // Мы генерируем случайное число в диапазоне длины массива (Math.random)
        // ЕСЛИ ИНДЕКС случайного числа в НОВОМ массиве уже прописан, то генерируем число заново



        for (int i = 0; i < idealArray.length; i++) {

        }
    }
}
