package zad1;

public class Rectangle {
    private double width;
    private double height;
    private static String color;

    public Rectangle(){
        setHeight(1);
        setWidth(1);
        setColor("yellow");
    }
    public Rectangle(double v, double v1) {
        setWidth(v);
        setHeight(v1);
    }

    public void setWidth(double width) {
        if(width > 0){
            this.width = width;
        }else{
            this.width = 1;
        }
    }

    public double getWidth() {
        return width;
    }


    public static void setColor(String color) {
        if (color == null) {
            Rectangle.color = "yellow";
        } else {
            Rectangle.color = color;
        }
    }

    public void setHeight(double height) {
        if(height > 0){
            this.height = height;
        }else{
            this.height = 1;
        }
    }

    public static String getColor() {
        return color;
    }

    public double getHeight() {
        return height;
    }
public double getArea(){
        return width*height;
}
    public double getPerimeter(){
        return 2* (height+width);
    }

    @Override
    public String toString() {
        return String.format("Width: %.2f, Height: %.2f, Color: %s\n",
                width, height, color);
    }
}
