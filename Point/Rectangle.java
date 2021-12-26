package zad1;

import javafx.scene.Group;
import javafx.scene.paint.Color;

public class Rectangle {
    private Point upoint;
    private double width;
    private double height;

    public Rectangle(){
this(new Point(),5,5);
    }
public Rectangle(Rectangle rectangle){
setHeight(rectangle.height);
setWidth(rectangle.width);
setUpoint(rectangle.upoint);
}

    @Override
    public String toString() {
        return String.format("%.2f, ;%.2f",upoint.toString(), width,height);

    }

    public double getHeight() {
        return height;
    }


    public Rectangle(Point upoint,double width, double height) {
        this.upoint = upoint;
        this.width = width;
        this.height=height;
    }

    public void setHeight(double height) {
        if(height>0) {
            this.height = height;
        } else{
            this.height=5;
        }
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width>0) {
            this.width = width;
        } else{
            this.height=5;
        }
    }

    public Point getUpoint() {
        return upoint;
    }

    public void setUpoint(Point upoint) {
        this.upoint = upoint;
    }
    public void draw(Group pane){
        javafx.scene.shape.Rectangle rectangle= new javafx.scene.shape.Rectangle(
        upoint.getCoords()[0], upoint.getCoords()[1], width, height);
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(1);
        pane.getChildren().add(rectangle);
    }

}
