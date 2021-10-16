package zad1;

public class RectangleTest {
    public static void main(String[] args){
        Rectangle rectangle = new Rectangle();
        //System.out.println(rectangle.toString());
        System.out.println(rectangle);
Rectangle.setColor("red");
        Rectangle rectangle2= new Rectangle(1.234, 2.456);
        System.out.println(rectangle2);
        rectangle2.setWidth(3);
        rectangle2.setHeight(4);
        System.out.printf("Area: %.3f, Perimeter: %.3f", rectangle2.getArea(), rectangle2.getPerimeter());
    }
}
