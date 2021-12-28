package tesk1;

public class Test {
    public static void main(String[] args) {
        Point point1= new Point();
        Point point2= new Point(new int[]{10,20});
        System.out.printf("P1: %s%n", point1);
        System.out.printf("P2: %s%n", point2);

        Line line=new Line(point1, point2);
        System.out.println(line);
        point1.setCoordinates(new int[]{100, 200});
        System.out.println(point2);
        System.out.println(line);
    }
}
