/**
 * 16M-OOP
 * 04 13 : 05
 */
public class Rectangle {
    int x;

    public Rectangle(int x) {
        this.x = x;
    }
}


class RectangleTest {
    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle(100);
        Rectangle secondRectangle = new Rectangle(50);
    }
}