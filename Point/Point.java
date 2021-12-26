package zad1;

import java.util.Arrays;

public class Point {
    private double[] coords;

    public void setCoords(double[] coords) {
        if(coords!=null &&coords.length==2) {
            this.coords = coords;

            for(int i=0; i<coords.length;++i){
                this.coords[i]=this.coords[i];
            }
        } else{
            this.coords=new double[2];
        }
    }
public Point(Point point){
        this(point.getCoords());
}
    public double[] getCoords() {
        double[] copy= new double[2];
        for(int i=0; i<copy.length;++i){
            copy[i]=coords[i];
        }
        return copy;
    }

    public Point(){
        this(new double[2]);
    }
    public Point(double[] coords) {
        this.coords = coords;
    }

    @Override
    public String toString() {
        return String.format("%.2f; %.2f",coords[0],coords[1]);
    }
}
