package tesk1;

public class Line extends Point{
    private static int idCounter=1;
    public final String L_ID;
    private Point ePoint;


    public Line(Point point, Point ePoint) {
        super(point);
        setePoint(ePoint);
        L_ID=String.format("%06d", idCounter++);
    }

    public Line() {
        this(new Point(), new Point());
    }
    public Line(Line line) {
        this(line.getsPoint(), line.ePoint);
    }
    //Point is a reference mutable type
    public final Point getePoint() {
        return new Point(ePoint);
    }
   // helper get method
    public final Point getPoint() {
// Point is reference mutable type
        return super.getsPoint();
    }

    // helper set method
    public final void setPoint(Point p) {
        if (p != null) {
            var c = p.getCoordinates();
// Point is reference mutable type
            super.setsPoint(p);
        }
        else{
            setCoordinates(new int[2]);
        }
    }
    public final void setePoint(Point ePoint) {
        this.ePoint = ePoint!=null?new Point(ePoint):new Point();
    }
public double measure(){
        var coords1= super.getCoordinates();
        var coords2= ePoint.getCoordinates();
        var xDelta= coords1[0]-coords2[0];
    var yDelta= coords1[0]-coords2[0];
    return Math.sqrt(xDelta*xDelta+yDelta*yDelta);
}
    @Override
    public String toString() {
        return String.format("Line sPoint= %s,ePoint= %s", getsPoint(),ePoint );
    }
}
