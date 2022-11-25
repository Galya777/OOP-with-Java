package PolarPointCoordinates;

import javafx.scene.Parent;

public class RPoint {
    private double r;
    private double titha;
    private double x;
    private double y;

    public RPoint(double r, double titha) {
        this.r = r;
        this.titha = titha;
        this.x=r*Math.cos(titha);
        this.y=r*Math.sin(titha);
    }

    public double getR() {
        return r;
    }

    public double getTitha() {
        return titha;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    double[] toCartesian(){
        double[] xy=new double[2];
        xy[0]=r*Math.cos(titha);
        xy[1]=r*Math.sin(titha);
                return xy;
    }

    double distanceTo( RPoint r){
        return Math.sqrt(Math.pow(x+r.getX(), 2)+Math.pow(y-r.getY(),2));
    }
    void drawLine (Parent node){
        
    }
}
