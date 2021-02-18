
public class Triangle6_1_Solution {
    public static void main(String[] args) {
        lovelyTriangle(6);
    }

    public static void lovelyTriangle(int size) {
        for (int i = 1; i <= size; i++) {
            // количество пробелов рисуем
            drawSpace(size, i);
            // рисуем цифры
            drawDigits(i);
            System.out.println();
        }
    }

    private static void drawDigits(int digit) {
        for (int i = 0; i < digit * 2 - 1; i++) {
            System.out.print(digit);
        }
    }

    private static void drawSpace(int size, int i) {
        for (int j = i; j < size; j++) {
            System.out.print(" ");
        }
    }
}
