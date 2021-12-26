package zad1;

import javafx.scene.Group;

public class Line {
    private Point sPoint;
    private Point ePoint;

    public Line() {
        this(new Point(), new Point(new double[]{10,10}));
    }
    public Line(Line line) {
        setePoint(ePoint);
        setsPoint(sPoint);
    }
    public Line(Point sPoint,Point ePoint) {
        this.sPoint = sPoint;
        this.ePoint = ePoint;
    }
    public Point getePoint() {
        return new Point(ePoint);
    }

    public void setePoint(Point ePoint) {
        if(ePoint==null) {
this.ePoint= new Point(new double[]{10,10});
        }else {
            this.ePoint = new Point(ePoint);
        }
    }

    public Point getsPoint() {
        return new Point(sPoint);
    }

    public void setsPoint(Point sPoint) {
        if(sPoint==null) {
            this.sPoint= new Point();
        }else {
            this.sPoint = new Point(sPoint);
        }
    }



    protected void draw(Group pane){
        javafx.scene.shape.Line line= new javafx.scene.shape.Line(
                sPoint.getCoords()[0],  sPoint.getCoords()[1],
                ePoint.getCoords()[0],  ePoint.getCoords()[1]
                );
        pane.getChildren().add(line);
    }

    @Override
    public String toString() {
        return String.format("Line starting coordinats: %s "+ "Line ending coordinats: %s ",
                sPoint.toString(),ePoint.toString());
    }
}
