package task2;

public class Car implements Comparable<Car>{
private String model;
private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public int compareTo(Car o) {
        /* if(this.year>o.year){
            return 1;
        }
        if(this.year<o.year){
            return -1;
        }
        return 0;*/
        return this.year- o.year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model is='" + model + '\'' +
                ", year is=" + year +
                '}';
    }
}
